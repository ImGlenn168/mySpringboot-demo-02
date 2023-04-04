package com.java.myspringbootdemo02.Common.convert.material;

import com.java.myspringbootdemo02.Common.po.MaterialPo;
import com.java.myspringbootdemo02.Common.vo.MaterialVo;

public class MaterialPoConvert {

    public static MaterialPo toMaterialPo(MaterialVo vo) {
        MaterialPo po = new MaterialPo();
        po.setId(vo.getId());
        po.setSupplierNum(vo.getSupplierNum());
        po.setMaterialNum(vo.getMaterialNum());
        po.setMaterialName(vo.getMaterialName());
        po.setWeight(vo.getWeight());
        po.setMadeBy(vo.getMadeBy());
        po.setPicture(vo.getPicture());
        po.setPackageSize(vo.getPackageSize());
        po.setStock(vo.getStock());
        po.setState(vo.getStateCode());
        po.setPrice(vo.getPrice());
        return po;
    }
}
