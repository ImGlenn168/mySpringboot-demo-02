package com.java.myspringbootdemo02.Common.vo;

import com.java.myspringbootdemo02.Common.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVo extends BaseEntity {
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
    // 状态码
    private int stateCode;
    // 状态
    private String state;
    // 描述
    private String description;
}