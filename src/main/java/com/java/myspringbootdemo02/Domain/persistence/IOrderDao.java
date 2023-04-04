package com.java.myspringbootdemo02.Domain.persistence;

import com.java.myspringbootdemo02.Common.po.OrderPo;

import java.util.List;

public interface IOrderDao {
     int save(OrderPo po);

     int batchAdd(List<OrderPo> list);

     int disableById(List<Integer> idList);

     int updateById(OrderPo po);

     OrderPo getById(int id);

     List<OrderPo> list();
}
