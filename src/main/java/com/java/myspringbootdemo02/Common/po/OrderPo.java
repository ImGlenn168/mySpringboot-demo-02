package com.java.myspringbootdemo02.Common.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPo {
    // 主键
    private int id;
    // 订单号
    private String orderNum;
    // 客户名称
    private String customerName;
    // 材料名称
    private String materialName;
    // 尺寸
    private String size;
    // 订单数量
    private int orderAmount;
    // 单价
    private BigDecimal unitPrice;
    // 总价
    private BigDecimal totalPrice;
    // 状态
    private int state;
    // 描述
    private String discription;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date updateTime;

}