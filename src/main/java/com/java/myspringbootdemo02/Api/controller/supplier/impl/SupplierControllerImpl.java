package com.java.myspringbootdemo02.Api.controller.supplier.impl;

import com.java.myspringbootdemo02.Api.controller.supplier.ISupplierController;
import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.App.service.supplier.ISupplierService;
import com.java.myspringbootdemo02.Common.po.SupplierPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierControllerImpl implements ISupplierController {

    @Autowired
    private ISupplierService supplierService;

    @Override
    public Result save(SupplierPo po) {
        return Result.result(supplierService.save(po));
    }

    @Override
    public Result batchAdd(List<SupplierPo> list) {
        return Result.result(supplierService.batchAdd(list));
    }

    @Override
    public Result disableById(List<Integer> idList) {
        return Result.result(supplierService.disableById(idList));
    }

    @Override
    public Result updateById(SupplierPo po) {
        return Result.result(supplierService.updateById(po));
    }

    @Override
    public Result get(int id) {
        return Result.result(supplierService.get(id));
    }

    @Override
    public Result list() {
        return Result.result(supplierService.list());
    }
}
