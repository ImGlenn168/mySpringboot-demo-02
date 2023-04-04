package com.java.myspringbootdemo02.Common.convert.order;

import com.java.myspringbootdemo02.Common.enums.order.OrderStateEnum;
import com.java.myspringbootdemo02.Common.po.OrderPo;
import com.java.myspringbootdemo02.Common.vo.OrderVo;

import java.text.SimpleDateFormat;

public class OrderVoConvert {

    public static OrderVo getOrderVo(OrderPo orderPo) {
        OrderVo orderVo = new OrderVo();
        orderVo.setId(orderPo.getId());
        orderVo.setOrderNum(orderPo.getOrderNum());
        orderVo.setCustomerName(orderPo.getCustomerName());
        orderVo.setMaterialName(orderPo.getMaterialName());
        orderVo.setSize(orderPo.getSize());
        orderVo.setOrderAmount(orderPo.getOrderAmount());
        orderVo.setUnitPrice(orderPo.getUnitPrice());
        orderVo.setTotalPrice(orderPo.getTotalPrice());
        orderVo.setStateCode(OrderStateEnum.getByCode(orderPo.getState()).getCode());
        orderVo.setState(OrderStateEnum.getByCode(orderPo.getState()).getMessage());
        orderVo.setDescription(orderPo.getDescription());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        orderVo.setCreateTime(simpleDateFormat.format(orderPo.getCreateTime()));
        orderVo.setUpdateTime(simpleDateFormat.format(orderPo.getUpdateTime()));
        return orderVo;
    }
}
