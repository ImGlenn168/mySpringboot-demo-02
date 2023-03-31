package com.java.myspringbootdemo02.Persistence.mapper;

import com.java.myspringbootdemo02.Common.po.MaterialPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IMaterialMapper {

    int save(MaterialPo po);

    int batchAdd(List<MaterialPo> list);

    int disableById(List<Integer> idList);

    int updateById(MaterialPo po);

    int get(int id);

    List<MaterialPo> list();

}
