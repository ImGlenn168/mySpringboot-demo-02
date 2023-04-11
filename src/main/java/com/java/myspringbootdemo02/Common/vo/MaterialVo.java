package com.java.myspringbootdemo02.Common.vo;

import com.java.myspringbootdemo02.Common.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.hpsf.Decimal;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialVo extends BaseEntity {
    private int id;
    private String supplierNum;
    private String materialNum;
    private String materialName;
    private int weight;
    private String madeBy;
    private String picture;
    private String packageSize;
    private int stock;
    private int stateCode;
    private String state;
    private BigDecimal price;
}