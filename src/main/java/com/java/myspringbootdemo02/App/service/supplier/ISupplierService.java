package com.java.myspringbootdemo02.App.service.supplier;

import com.java.myspringbootdemo02.Common.po.SupplierPo;

import java.util.List;

public interface ISupplierService {

    int save(SupplierPo po);

    int batchAdd(List<SupplierPo> list);

    int disableById(List<Integer> idList);

    int updateById(SupplierPo po);

    int get(int id);

    List<SupplierPo> list();
}

