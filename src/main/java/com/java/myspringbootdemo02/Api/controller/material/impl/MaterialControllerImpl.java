package com.java.myspringbootdemo02.Api.controller.material.impl;

import com.java.myspringbootdemo02.Api.controller.material.IMaterialController;
import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.App.service.material.IMaterialService;
import com.java.myspringbootdemo02.App.service.material.impl.MaterialPoolService;
import com.java.myspringbootdemo02.Common.vo.MaterialVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaterialControllerImpl implements IMaterialController {

    @Autowired
    private IMaterialService materialService;

    @Autowired
    private MaterialPoolService materialPoolService;

    @Override
    public Result save(MaterialVo vo) {
        return Result.result(materialService.save(vo));
    }

    @Override
    public Result batchAdd(List<MaterialVo> list) {
        return Result.result(materialService.batchAdd(list));
    }

    @Override
    public Result disableById(List<Integer> idList) {
        return Result.result(materialService.disableById(idList));
    }

    @Override
    public Result updateById(MaterialVo vo) {
        return Result.result(materialService.updateById(vo));
    }

    @Override
    public Result getById(@PathVariable("id") int id) {
        return Result.result(materialService.getById(id));
    }

    @Override
    public Result list() {
        return Result.result(materialService.list());
    }

    @Override
    public Result getByTheadPool(@PathVariable("id") int id) {
        return Result.result(materialPoolService.getMaterial(id));
    }
}
