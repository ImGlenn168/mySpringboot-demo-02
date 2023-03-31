package com.java.myspringbootdemo02.Common.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierPo {
    /**
     * 自增id
     */
    private int id;
    /**
     * 供应商编号
     */
    private String supplierNum;
    /**
     * 公司名
     */
    private String companyName;
    /**
     * 联系人
     */
    private String contactName;
    /**
     * 电话
     */
    private String phone;
    /**
     * 微信号
     */
    private String wechatNum;
    /**
     * 状态
     */
    private int state;
    /**
     * 描述
     */
    private String description;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}