package com.java.myspringbootdemo02.Common.convert.order;

import com.java.myspringbootdemo02.Common.enums.order.OrderStateEnum;
import com.java.myspringbootdemo02.Common.po.OrderPo;
import com.java.myspringbootdemo02.Common.vo.OrderVo;

public class OrderPoConvert {

    public static OrderPo getOrderPo(OrderVo orderVo) {
        OrderPo orderPo = new OrderPo();
        orderPo.setId(orderVo.getId());
        orderPo.setOrderNum(orderVo.getOrderNum());
        orderPo.setCustomerName(orderVo.getCustomerName());
        orderPo.setMaterialName(orderVo.getMaterialName());
        orderPo.setSize(orderVo.getSize());
        orderPo.setOrderAmount(orderVo.getOrderAmount());
        orderPo.setUnitPrice(orderVo.getUnitPrice());
        orderPo.setTotalPrice(orderVo.getTotalPrice());
        orderPo.setState(OrderStateEnum.getByCode(orderVo.getStateCode()).getCode());
        orderPo.setDescription(orderVo.getDescription());
        return orderPo;
    }

}
