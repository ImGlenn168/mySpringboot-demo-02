package com.java.myspringbootdemo02.Persistence.mapper.impl;

import com.java.myspringbootdemo02.Common.po.MaterialPo;
import com.java.myspringbootdemo02.Domain.persistence.IMaterialDao;
import com.java.myspringbootdemo02.Persistence.mapper.IMaterialMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MaterialMapperImpl implements IMaterialDao {

    @Autowired
    private IMaterialMapper materialMapper;

    @Override
    public int save(MaterialPo po) {
        materialMapper.save(po);
        return po.getId();
    }

    @Override
    public int batchAdd(List<MaterialPo> list) {
        return materialMapper.batchAdd(list);
    }

    @Override
    public int disableById(List<Integer> idList) {
        return materialMapper.disableById(idList);
    }

    @Override
    public int updateById(MaterialPo po) {
        return materialMapper.updateById(po);
    }

    @Override
    public int get(int id) {
        return materialMapper.get(id);
    }

    @Override
    public List<MaterialPo> list() {
        return materialMapper.list();
    }
}
