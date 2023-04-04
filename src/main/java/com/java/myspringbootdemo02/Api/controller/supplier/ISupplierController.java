package com.java.myspringbootdemo02.Api.controller.supplier;

import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.Common.vo.SupplierVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ISupplierController {

    @PostMapping("/supplier/save")
    Result save(@RequestBody SupplierVo vo);

    @PostMapping("/supplier/batchAdd")
    Result batchAdd(@RequestBody List<SupplierVo> list);

    @PostMapping("/supplier/disableById")
    Result disableById(@RequestBody List<Integer> idList);

    @PostMapping("/supplier/updateById")
    Result updateById(@RequestBody SupplierVo vo);

    @GetMapping("/supplier/get/{id}")
    Result getById(@PathVariable("id") int id);

    @GetMapping("/supplier/list")
    Result list();

}
