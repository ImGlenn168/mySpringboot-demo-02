package com.java.myspringbootdemo02.Common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiOperator {
    // 身份校验
    private String status;
    // 操作行为
    private String action;
    // 操作人
    private String operatorName;
    // 操作时间
    private String operateTime;
    // 方法名
    private String methodName;
}
