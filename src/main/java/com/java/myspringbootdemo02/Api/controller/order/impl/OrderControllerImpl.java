package com.java.myspringbootdemo02.Api.controller.order.impl;

import com.java.myspringbootdemo02.Api.controller.order.IOrderController;
import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.App.service.order.IOrderService;
import com.java.myspringbootdemo02.Common.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderControllerImpl implements IOrderController {

    @Autowired
    private IOrderService orderService;

    @Override
    public Result save(OrderVo po) {
        return Result.result(orderService.save(po));
    }

    @Override
    public Result batchAdd(List<OrderVo> list) {
        return Result.result(orderService.batchAdd(list));
    }

    @Override
    public Result disableById(List<Integer> idList) {
        return Result.result(orderService.disableById(idList));
    }

    @Override
    public Result updateById(OrderVo vo) {
        return Result.result(orderService.updateById(vo));
    }

    @Override
    public Result getById(@PathVariable("id") int id) {
        return Result.result(orderService.getById(id));
    }

    @Override
    public Result list() {
        return Result.result(orderService.list());
    }
}
