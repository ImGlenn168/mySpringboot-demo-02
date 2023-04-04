package com.java.myspringbootdemo02.App.service.supplier;

import com.java.myspringbootdemo02.Common.po.SupplierPo;
import com.java.myspringbootdemo02.Common.vo.SupplierVo;

import java.util.List;

public interface ISupplierService {

    int save(SupplierVo vo);

    int batchAdd(List<SupplierVo> list);

    int disableById(List<Integer> idList);

    int updateById(SupplierVo vo);

    SupplierVo getById(int id);

    List<SupplierPo> list();
}

