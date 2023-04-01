package com.java.myspringbootdemo02.Common.convert.material;

import com.java.myspringbootdemo02.Common.enums.material.MaterialStateEnum;
import com.java.myspringbootdemo02.Common.po.MaterialPo;
import com.java.myspringbootdemo02.Common.vo.MaterialVo;

public class MaterialVoConvert {

    public static MaterialVo toMaterialVo(MaterialPo po) {
        MaterialVo vo = new MaterialVo();
        vo.setId(po.getId());
        vo.setSupplierNum(po.getSupplierNum());
        vo.setMaterialNum(po.getMaterialNum());
        vo.setMaterialName(po.getMaterialName());
        vo.setWeight(po.getWeight());
        vo.setMadeBy(po.getMadeBy());
        vo.setPicture(po.getPicture());
        vo.setPackageSize(po.getPackageSize());
        vo.setStock(po.getStock());
        vo.setStateCode(MaterialStateEnum.getByCode(po.getState()).getCode());
        vo.setState(MaterialStateEnum.getByCode(po.getState()).getMessage());
        vo.setPrice(po.getPrice());
        vo.setCreateTime(po.getCreateTime());
        vo.setUpdateTime(po.getUpdateTime());
        return vo;
    }
}
