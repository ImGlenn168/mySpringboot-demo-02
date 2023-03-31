package com.java.myspringbootdemo02.Api.controller.supplier;

import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.Common.po.SupplierPo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ISupplierController {

    @PostMapping("/supplier/save")
    Result save(@RequestBody SupplierPo po);

    @PostMapping("/supplier/batchAdd")
    Result batchAdd(@RequestBody List<SupplierPo> list);

    @PostMapping("/supplier/disableById")
    Result disableById(@RequestBody List<Integer> idList);

    @PostMapping("/supplier/updateById")
    Result updateById(@RequestBody SupplierPo po);

    @PostMapping("/supplier/get")
    Result get(@RequestBody int id);

    @PostMapping("/supplier/list")
    Result list();

}
