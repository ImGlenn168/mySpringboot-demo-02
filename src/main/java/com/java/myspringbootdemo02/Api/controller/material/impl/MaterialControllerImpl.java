package com.java.myspringbootdemo02.Api.controller.material.impl;

import com.java.myspringbootdemo02.Api.controller.material.IMaterialController;
import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.App.service.material.IMaterialService;
import com.java.myspringbootdemo02.Common.po.MaterialPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaterialControllerImpl implements IMaterialController {

    @Autowired
    private IMaterialService materialService;

    @Override
    public Result save(MaterialPo po) {
        return Result.result(materialService.save(po));
    }

    @Override
    public Result batchAdd(List<MaterialPo> list) {
        return Result.result(materialService.batchAdd(list));
    }

    @Override
    public Result disableById(List<Integer> idList) {
        return Result.result(materialService.disableById(idList));
    }

    @Override
    public Result updateById(MaterialPo po) {
        return Result.result(materialService.updateById(po));
    }

    @Override
    public Result get(int id) {
        return Result.result(materialService.get(id));
    }

    @Override
    public Result list() {
        return Result.result(materialService.list());
    }
}
