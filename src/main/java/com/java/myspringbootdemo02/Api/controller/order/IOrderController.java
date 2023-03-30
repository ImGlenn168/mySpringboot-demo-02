package com.java.myspringbootdemo02.Api.controller.order;

import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.Common.po.OrderPo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IOrderController {

    @PostMapping("/order/save")
    Result save(@RequestBody OrderPo po);

    @PostMapping("/order/batchAdd")
    Result batchAdd(@RequestBody List<OrderPo> list);

    @PostMapping("/order/disableById")
    Result disableById(@RequestBody List<Integer> idList);

    @PostMapping("/order/updateById")
    Result updateById(@RequestBody OrderPo po);

    @PostMapping("/order/get")
    Result get(@RequestBody int id);

    @PostMapping("/order/list")
    Result list();

}
