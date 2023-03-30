package com.java.myspringbootdemo02.Common.vo;

import com.java.myspringbootdemo02.Common.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerVo extends BaseEntity {
    private String id;
    private String customerNum;
    private String country;
    private String companyName;
    private String companyAddress;
    private String customerName;
    private String password;
    private String phone;
    private String wechatNum;
    private int stateCode;
    private String state;
    private String followedBy;
    private String description;
}
