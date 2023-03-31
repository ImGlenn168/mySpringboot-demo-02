package com.java.myspringbootdemo02.App.service.supplier.impl;

import com.java.myspringbootdemo02.App.service.supplier.ISupplierService;
import com.java.myspringbootdemo02.Common.po.SupplierPo;
import com.java.myspringbootdemo02.Domain.persistence.ISupplierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements ISupplierService {

    @Autowired
    private ISupplierDao supplierDao;

    @Override
    public int save(SupplierPo po) {
        return supplierDao.save(po);
    }

    @Override
    public int batchAdd(List<SupplierPo> list) {
        return supplierDao.batchAdd(list);
    }

    @Override
    public int disableById(List<Integer> idList) {
        return supplierDao.disableById(idList);
    }

    @Override
    public int updateById(SupplierPo po) {
        return supplierDao.updateById(po);
    }

    @Override
    public int get(int id) {
        return supplierDao.get(id);
    }

    @Override
    public List<SupplierPo> list() {
        return supplierDao.list();
    }
}
