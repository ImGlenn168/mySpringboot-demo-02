package com.java.myspringbootdemo02.App.service.order;

import com.java.myspringbootdemo02.Common.po.OrderPo;
import com.java.myspringbootdemo02.Common.vo.OrderVo;

import java.util.List;

public interface IOrderService {

    int save(OrderVo vo);

    int batchAdd(List<OrderVo> list);

    int disableById(List<Integer> idList);

    int updateById(OrderVo vo);

    OrderVo getById(int id);

    List<OrderVo> list();
}

