package com.java.myspringbootdemo02.Common.convert.supplier;

import com.java.myspringbootdemo02.Common.enums.supplier.SupplierStateEnum;
import com.java.myspringbootdemo02.Common.po.SupplierPo;
import com.java.myspringbootdemo02.Common.vo.SupplierVo;

public class SupplierPoConvert {
    public static SupplierPo getSupplierPo(SupplierVo supplierVo) {
        SupplierPo supplierPo = new SupplierPo();
        supplierPo.setId(supplierVo.getId());
        supplierPo.setSupplierNum(supplierVo.getSupplierNum());
        supplierPo.setCompanyName(supplierVo.getCompanyName());
        supplierPo.setContactName(supplierVo.getContactName());
        supplierPo.setPhone(supplierVo.getPhone());
        supplierPo.setWechatNum(supplierVo.getWechatNum());
        supplierPo.setState(SupplierStateEnum.getByCode(supplierVo.getStateCode()).getCode());
        supplierPo.setDescription(supplierVo.getDescription());
        return supplierPo;
    }
}
