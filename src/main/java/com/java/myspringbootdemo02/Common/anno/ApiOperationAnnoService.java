package com.java.myspringbootdemo02.Common.anno;

import com.java.myspringbootdemo02.Common.vo.ApiOperator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.lang.reflect.Method;

@Slf4j
@Service
public class ApiOperationAnnoService {

    @Value("${anno.aClass}")
    private String aClass;

    public ApiOperator buildApiOperationLog(ApiOperator apiOperator) {
            synchronized (ApiOperationAnnoService.class) {
                try {
                    // 检查注解的类
                    Class<?> aClass = Class.forName(this.aClass);
                    Method[] declaredMethods = aClass.getDeclaredMethods();
                    for (Method declaredMethod : declaredMethods) {
                        log.info("current method : {}", declaredMethod);
                        boolean present = declaredMethod.isAnnotationPresent(ApiOperationAnno.class);
                        if (present) {
                            ApiOperationAnno annotation = declaredMethod.getAnnotation(ApiOperationAnno.class);
                            log.info("annotation: {}", annotation);
                            apiOperator.setMethodName(declaredMethod.getName());
                            apiOperator.setStatus(annotation.status());
                            apiOperator.setAction(annotation.action());
                        }
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        return apiOperator;
    }
}
