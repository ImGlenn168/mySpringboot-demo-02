package com.java.myspringbootdemo02.Common.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.hpsf.Decimal;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialPo {
    private int id;
    private String supplierNum;
    private String materialNum;
    private String materialName;
    private int weight;
    private String madeBy;
    private String picture;
    private String packageSize;
    private int stock;
    private int state;
    private BigDecimal price;
    private Date createTime;
    private Date updateTime;
}