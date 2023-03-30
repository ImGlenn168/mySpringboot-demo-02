package com.java.myspringbootdemo02.Persistence.mapper.impl;

import com.java.myspringbootdemo02.Common.po.OrderPo;
import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Domain.persistence.IOrderDao;
import com.java.myspringbootdemo02.Persistence.mapper.IOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderMapperImpl implements IOrderDao {

    @Autowired
    private IOrderMapper orderMapper;

    @Override
    public int save(OrderPo po) {
        orderMapper.save(po);
        return po.getId();
    }

    @Override
    public int batchAdd(List<OrderPo> list) {
        return orderMapper.batchAdd(list);
    }

    @Override
    public int disableById(List<Integer> idList) {
        return orderMapper.disableById(idList);
    }

    @Override
    public int updateById(OrderPo po) {
        return orderMapper.updateById(po);
    }

    @Override
    public int get(int id) {
        return orderMapper.get(id);
    }

    @Override
    public List<OrderPo> list() {
        return orderMapper.list();
    }
}
