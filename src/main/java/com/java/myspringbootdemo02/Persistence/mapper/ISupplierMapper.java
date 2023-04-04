package com.java.myspringbootdemo02.Persistence.mapper;

import com.java.myspringbootdemo02.Common.po.SupplierPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ISupplierMapper {

    int save(SupplierPo po);

    int batchAdd(List<SupplierPo> list);

    int disableById(List<Integer> idList);

    int updateById(SupplierPo po);

    SupplierPo getById(int id);

    List<SupplierPo> list();

}
