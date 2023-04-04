package com.java.myspringbootdemo02.Api.controller.order;

import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.Common.vo.OrderVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IOrderController {

    @PostMapping("/order/save")
    Result save(@RequestBody OrderVo vo);

    @PostMapping("/order/batchAdd")
    Result batchAdd(@RequestBody List<OrderVo> list);

    @PostMapping("/order/disableById")
    Result disableById(@RequestBody List<Integer> idList);

    @PostMapping("/order/updateById")
    Result updateById(@RequestBody OrderVo vo);

    @GetMapping("/order/get/{id}")
    Result getById(@PathVariable("id") int id);

    @GetMapping("/order/list")
    Result list();

}
