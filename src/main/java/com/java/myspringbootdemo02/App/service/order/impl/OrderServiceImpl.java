package com.java.myspringbootdemo02.App.service.order.impl;

import com.java.myspringbootdemo02.App.service.order.IOrderService;
import com.java.myspringbootdemo02.Common.po.OrderPo;
import com.java.myspringbootdemo02.Domain.persistence.IOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderDao orderDao;

    @Override
    public int save(OrderPo po) {
        return orderDao.save(po);
    }

    @Override
    public int batchAdd(List<OrderPo> list) {
        return orderDao.batchAdd(list);
    }

    @Override
    public int disableById(List<Integer> idList) {
        return orderDao.disableById(idList);
    }

    @Override
    public int updateById(OrderPo po) {
        return orderDao.updateById(po);
    }

    @Override
    public int get(int id) {
        return orderDao.get(id);
    }

    @Override
    public List<OrderPo> list() {
        return orderDao.list();
    }
}
