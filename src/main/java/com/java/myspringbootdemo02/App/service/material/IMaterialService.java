package com.java.myspringbootdemo02.App.service.material;

import com.java.myspringbootdemo02.Common.po.MaterialPo;

import java.util.List;

public interface IMaterialService {

    int save(MaterialPo po);

    int batchAdd(List<MaterialPo> list);

    int disableById(List<Integer> idList);

    int updateById(MaterialPo po);

    int get(int id);

    List<MaterialPo> list();
}

