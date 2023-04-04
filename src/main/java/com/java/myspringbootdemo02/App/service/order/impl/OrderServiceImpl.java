package com.java.myspringbootdemo02.App.service.order.impl;

import com.java.myspringbootdemo02.App.service.order.IOrderService;
import com.java.myspringbootdemo02.Common.convert.order.OrderPoConvert;
import com.java.myspringbootdemo02.Common.convert.order.OrderVoConvert;
import com.java.myspringbootdemo02.Common.po.OrderPo;
import com.java.myspringbootdemo02.Common.vo.OrderVo;
import com.java.myspringbootdemo02.Domain.persistence.IOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderDao orderDao;

    @Override
    public int save(OrderVo vo) {
        return orderDao.save(OrderPoConvert.getOrderPo(vo));
    }

    @Override
    public int batchAdd(List<OrderVo> list) {
        ArrayList<OrderPo> orderPos = new ArrayList<>();
        for (OrderVo orderVo : list) {
            OrderPo orderPo = OrderPoConvert.getOrderPo(orderVo);
            orderPos.add(orderPo);
        }
        return orderDao.batchAdd(orderPos);
    }

    @Override
    public int disableById(List<Integer> idList) {
        return orderDao.disableById(idList);
    }

    @Override
    public int updateById(OrderVo vo) {
        return orderDao.updateById(OrderPoConvert.getOrderPo(vo));
    }

    @Override
    public OrderVo getById(int id) {
        OrderPo orderPo = orderDao.getById(id);

        return OrderVoConvert.getOrderVo(orderPo);
    }

    @Override
    public List<OrderVo> list() {
        List<OrderPo> list = orderDao.list();
        ArrayList<OrderVo> orderVos = new ArrayList<>();
        for (OrderPo orderPo : list) {
            OrderVo orderVo=OrderVoConvert.getOrderVo(orderPo);
            orderVos.add(orderVo);
        }
        return orderVos;
    }
}
