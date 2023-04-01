package com.java.myspringbootdemo02.App.service.material;

import com.java.myspringbootdemo02.Common.po.MaterialPo;
import com.java.myspringbootdemo02.Common.vo.MaterialVo;

import java.util.List;

public interface IMaterialService {

    int save(MaterialVo vo);

    int batchAdd(List<MaterialVo> list);

    int disableById(List<Integer> idList);

    int updateById(MaterialVo vo);

    int get(int id);

    List<MaterialVo> list();
}

