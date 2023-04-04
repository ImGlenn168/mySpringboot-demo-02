package com.java.myspringbootdemo02.Domain.persistence;

import com.java.myspringbootdemo02.Common.po.MaterialPo;
import com.java.myspringbootdemo02.Common.vo.MaterialVo;

import java.util.List;

public interface IMaterialDao {
     int save(MaterialPo po);

     int batchAdd(List<MaterialPo> list);

     int disableById(List<Integer> idList);

     int updateById(MaterialPo po);

     MaterialPo getById(int id);

     List<MaterialPo> list();
}
