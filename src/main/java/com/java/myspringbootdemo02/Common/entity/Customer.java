package com.java.myspringbootdemo02.Common.entity;

import com.java.myspringbootdemo02.Common.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity {
    private int id;
    private String customerNum;
    private String country;
    private String companyName;
    private String companyAddress;
    private String customerName;
    private String password;
    private String phone;
    private String wechatNum;
    private int state;
    private String followedBy;
    private String description;
}
