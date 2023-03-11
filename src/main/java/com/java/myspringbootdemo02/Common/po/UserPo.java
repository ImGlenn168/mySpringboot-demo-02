package com.java.myspringbootdemo02.Common.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPo {
    private int id;
    private String userName;
    private String password;
    private String phone;

    public UserPo(String userName, String password, String phone) {
        this.userName = userName;
        this.password = password;
        this.phone = phone;
    }
}
