package com.java.myspringbootdemo02.Domain.persistence;

import com.java.myspringbootdemo02.Common.po.SupplierPo;

import java.util.List;

public interface ISupplierDao {
     int save(SupplierPo po);

     int batchAdd(List<SupplierPo> list);

     int disableById(List<Integer> idList);

     int updateById(SupplierPo po);

     SupplierPo getById(int id);

     List<SupplierPo> list();
}
