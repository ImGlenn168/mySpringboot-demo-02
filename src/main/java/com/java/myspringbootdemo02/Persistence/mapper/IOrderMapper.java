package com.java.myspringbootdemo02.Persistence.mapper;

import com.java.myspringbootdemo02.Common.po.OrderPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IOrderMapper {

    int save(OrderPo po);

    int batchAdd(List<OrderPo> list);

    int disableById(List<Integer> idList);

    int updateById(OrderPo po);

    OrderPo getById(int id);

    List<OrderPo> list();

}
