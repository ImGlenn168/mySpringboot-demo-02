package com.java.myspringbootdemo02.App.service.material.impl;

import com.java.myspringbootdemo02.Common.convert.material.MaterialVoConvert;
import com.java.myspringbootdemo02.Common.vo.MaterialVo;
import com.java.myspringbootdemo02.Domain.persistence.IMaterialDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialCheckService {

    @Autowired
    private IMaterialDao materialDao;

    public MaterialVo getById(int i, int id) {
        MaterialVo materialVo = null;
        if (i == 1) {
            materialVo = MaterialVoConvert.toMaterialVo(materialDao.getById(id));
        } else if (i == 2) {
            materialVo = MaterialVoConvert.toMaterialVo(materialDao.getById(id));
        } else if (i == 3) {
            materialVo = MaterialVoConvert.toMaterialVo(materialDao.getById(id));
        } else if (i == 4) {
            materialVo = MaterialVoConvert.toMaterialVo(materialDao.getById(id));
        } else if (i == 5) {
            materialVo = MaterialVoConvert.toMaterialVo(materialDao.getById(id));
        }
        return materialVo;
    }
}
