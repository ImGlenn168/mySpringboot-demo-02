package com.java.myspringbootdemo02.Api.controller.supplier.impl;

import com.java.myspringbootdemo02.Api.controller.supplier.ISupplierController;
import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.App.service.supplier.ISupplierService;
import com.java.myspringbootdemo02.Common.vo.SupplierVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierControllerImpl implements ISupplierController {

    @Autowired
    private ISupplierService supplierService;

    @Override
    public Result save(SupplierVo vo) {
        return Result.result(supplierService.save(vo));
    }

    @Override
    public Result batchAdd(List<SupplierVo> list) {
        return Result.result(supplierService.batchAdd(list));
    }

    @Override
    public Result disableById(List<Integer> idList) {
        return Result.result(supplierService.disableById(idList));
    }

    @Override
    public Result updateById(SupplierVo vo) {
        return Result.result(supplierService.updateById(vo));
    }

    @Override
    public Result getById(@PathVariable("id") int id) {
        return Result.result(supplierService.getById(id));
    }

    @Override
    public Result list() {
        return Result.result(supplierService.list());
    }
}
