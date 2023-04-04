package com.java.myspringbootdemo02.Common.vo;

import com.java.myspringbootdemo02.Common.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierVo extends BaseEntity {
    // 自增id
    private int id;
    // 供应商编号
    private String supplierNum;
    // 公司名
    private String companyName;
    // 联系人
    private String contactName;
    // 电话
    private String phone;
    // 微信号
    private String wechatNum;
    // 状态码
    private int stateCode;
    // 状态
    private String state;
    // 描述
    private String description;
}