package com.java.myspringbootdemo02.App.service.supplier.impl;

import com.java.myspringbootdemo02.App.service.supplier.ISupplierService;
import com.java.myspringbootdemo02.Common.convert.supplier.SupplierPoConvert;
import com.java.myspringbootdemo02.Common.convert.supplier.SupplierVoConvert;
import com.java.myspringbootdemo02.Common.po.SupplierPo;
import com.java.myspringbootdemo02.Common.vo.SupplierVo;
import com.java.myspringbootdemo02.Domain.persistence.ISupplierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierServiceImpl implements ISupplierService {

    @Autowired
    private ISupplierDao supplierDao;

    @Override
    public int save(SupplierVo vo) {
        return supplierDao.save(SupplierPoConvert.getSupplierPo(vo));
    }

    @Override
    public int batchAdd(List<SupplierVo> list) {
        ArrayList<SupplierPo> supplierPos = new ArrayList<>();
        for (SupplierVo supplierVo : list) {
            SupplierPo supplierPo = SupplierPoConvert.getSupplierPo(supplierVo);
            supplierPos.add(supplierPo);
        }
        return supplierDao.batchAdd(supplierPos);
    }

    @Override
    public int disableById(List<Integer> idList) {
        return supplierDao.disableById(idList);
    }

    @Override
    public int updateById(SupplierVo vo) {
        SupplierPo supplierPo = SupplierPoConvert.getSupplierPo(vo);
        return supplierDao.updateById(supplierPo);
    }

    @Override
    public SupplierVo getById(int id) {
        SupplierPo supplierPo = supplierDao.getById(id);
        return SupplierVoConvert.getSupplierVo(supplierPo);
    }

    @Override
    public List<SupplierPo> list() {
        return supplierDao.list();
    }
}
