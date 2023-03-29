package com.java.myspringbootdemo02.Common.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerManagementPO {
    private int id;
    private String customerNum;
    private String country;
    private String companyName;
    private String companyAddress;
    private String customerName;
    private String password;
    private String phone;
    private String wechatNum;
    private Integer state;
    private String followedBy;
    private String description;
    private Date createTime;
    private Date updateTime;

}