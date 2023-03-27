package com.java.myspringbootdemo02.Common.entity;

import com.java.myspringbootdemo02.Common.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {
    private int id;
    private String userName;
    private String password;
    private String phone;
    private String dept;
    private int status;
    private Date hireTime;
}
