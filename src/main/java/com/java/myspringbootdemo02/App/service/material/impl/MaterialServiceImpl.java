package com.java.myspringbootdemo02.App.service.material.impl;

import com.java.myspringbootdemo02.App.service.material.IMaterialService;
import com.java.myspringbootdemo02.Common.po.MaterialPo;
import com.java.myspringbootdemo02.Domain.persistence.IMaterialDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements IMaterialService {

    @Autowired
    private IMaterialDao materialDao;

    @Override
    public int save(MaterialPo po) {
        return materialDao.save(po);
    }

    @Override
    public int batchAdd(List<MaterialPo> list) {
        return materialDao.batchAdd(list);
    }

    @Override
    public int disableById(List<Integer> idList) {
        return materialDao.disableById(idList);
    }

    @Override
    public int updateById(MaterialPo po) {
        return materialDao.updateById(po);
    }

    @Override
    public int get(int id) {
        return materialDao.get(id);
    }

    @Override
    public List<MaterialPo> list() {
        return materialDao.list();
    }
}
