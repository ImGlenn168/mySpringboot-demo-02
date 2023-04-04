package com.java.myspringbootdemo02.Persistence.mapper.impl;

import com.java.myspringbootdemo02.Common.po.SupplierPo;
import com.java.myspringbootdemo02.Domain.persistence.ISupplierDao;
import com.java.myspringbootdemo02.Persistence.mapper.ISupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SupplierMapperImpl implements ISupplierDao {

    @Autowired
    private ISupplierMapper supplierMapper;

    @Override
    public int save(SupplierPo po) {
        supplierMapper.save(po);
        return po.getId();
    }

    @Override
    public int batchAdd(List<SupplierPo> list) {
        return supplierMapper.batchAdd(list);
    }

    @Override
    public int disableById(List<Integer> idList) {
        return supplierMapper.disableById(idList);
    }

    @Override
    public int updateById(SupplierPo po) {
        return supplierMapper.updateById(po);
    }

    @Override
    public SupplierPo getById(int id) {
        return supplierMapper.getById(id);
    }

    @Override
    public List<SupplierPo> list() {
        return supplierMapper.list();
    }
}
