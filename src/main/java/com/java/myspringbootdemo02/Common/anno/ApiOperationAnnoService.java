package com.java.myspringbootdemo02.Common.anno;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.HashMap;

@Slf4j
@Service
public class ApiOperationAnnoService {
    private static volatile HashMap<String, String> map;

    public static HashMap<String, String> buildApiOperationLog() {
        if (map == null) {
            synchronized (ApiOperationAnnoService.class) {
                try {
                    // 检查注解的类
                    Class<?> aClass = Class.forName("");
                    Method[] declaredMethods = aClass.getDeclaredMethods();
                    for (Method declaredMethod : declaredMethods) {
                        log.info("current method : {}", declaredMethod);
                        boolean present = declaredMethod.isAnnotationPresent(ApiOperationAnno.class);
                        if (present) {
                            ApiOperationAnno annotation = declaredMethod.getAnnotation(ApiOperationAnno.class);
                            log.info("annotation: {}", annotation);
                            map.put(declaredMethod.getName(), declaredMethod.getName());
                            map.put("operator", annotation.operator());
                            map.put("operateTime", annotation.operateTime());

                        }
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return map;
    }
}
