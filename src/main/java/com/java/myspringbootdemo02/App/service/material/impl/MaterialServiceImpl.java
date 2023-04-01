package com.java.myspringbootdemo02.App.service.material.impl;

import com.java.myspringbootdemo02.App.service.material.IMaterialService;
import com.java.myspringbootdemo02.Common.convert.material.MaterialPoConvert;
import com.java.myspringbootdemo02.Common.convert.material.MaterialVoConvert;
import com.java.myspringbootdemo02.Common.po.MaterialPo;
import com.java.myspringbootdemo02.Common.vo.MaterialVo;
import com.java.myspringbootdemo02.Domain.persistence.IMaterialDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaterialServiceImpl implements IMaterialService {

    @Autowired
    private IMaterialDao materialDao;

    @Override
    public int save(MaterialVo vo) {
        return materialDao.save(MaterialPoConvert.toMaterialPo(vo));
    }

    @Override
    public int batchAdd(List<MaterialVo> list) {
        ArrayList<MaterialPo> materialPos = new ArrayList<>();
        for (MaterialVo materialVo : list) {
            MaterialPo materialPo = MaterialPoConvert.toMaterialPo(materialVo);
            materialPos.add(materialPo);
        }
        return materialDao.batchAdd(materialPos);
    }

    @Override
    public int disableById(List<Integer> idList) {
        return materialDao.disableById(idList);
    }

    @Override
    public int updateById(MaterialVo vo) {
        return materialDao.updateById(MaterialPoConvert.toMaterialPo(vo));
    }

    @Override
    public int get(int id) {
        return materialDao.get(id);
    }

    @Override
    public List<MaterialVo> list() {
        ArrayList<MaterialVo> materialVos = new ArrayList<>();
        List<MaterialPo> list = materialDao.list();
        for (MaterialPo materialPo : list) {
            MaterialVo materialVo = MaterialVoConvert.toMaterialVo(materialPo);
            materialVos.add(materialVo);
        }
        return materialVos;
    }
}
