package com.java.myspringbootdemo02.Common.convert.supplier;

import com.java.myspringbootdemo02.Common.enums.supplier.SupplierStateEnum;
import com.java.myspringbootdemo02.Common.po.SupplierPo;
import com.java.myspringbootdemo02.Common.vo.SupplierVo;
import java.text.SimpleDateFormat;

public class SupplierVoConvert {
    public static SupplierVo getSupplierVo(SupplierPo supplierPo) {
        SupplierVo supplierVo = new SupplierVo();
        supplierVo.setId(supplierPo.getId());
        supplierVo.setSupplierNum(supplierPo.getSupplierNum());
        supplierVo.setCompanyName(supplierPo.getCompanyName());
        supplierVo.setContactName(supplierPo.getContactName());
        supplierVo.setPhone(supplierPo.getPhone());
        supplierVo.setWechatNum(supplierPo.getWechatNum());
        supplierVo.setState(SupplierStateEnum.getByCode(supplierPo.getState()).getMessage());
        supplierVo.setStateCode(SupplierStateEnum.getByCode(supplierPo.getState()).getCode());
        supplierVo.setDescription(supplierPo.getDescription());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        supplierVo.setCreateTime(simpleDateFormat.format(supplierPo.getCreateTime()));
        supplierVo.setUpdateTime(simpleDateFormat.format(supplierPo.getUpdateTime()));
        return supplierVo;
    }
}
