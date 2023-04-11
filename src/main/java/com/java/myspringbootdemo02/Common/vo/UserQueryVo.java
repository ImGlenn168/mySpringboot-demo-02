package com.java.myspringbootdemo02.Common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQueryVo {
    private String userName;
    private String startTime;
    private String endTime;
}
