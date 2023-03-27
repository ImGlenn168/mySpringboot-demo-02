package com.java.myspringbootdemo02.Common.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {
    private String createTime;
    private String updateTime;
}
