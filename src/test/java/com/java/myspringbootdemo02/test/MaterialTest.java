package com.java.myspringbootdemo02.test;

import com.java.myspringbootdemo02.Common.po.MaterialPo;
import com.java.myspringbootdemo02.Domain.persistence.IMaterialDao;
import org.apache.poi.hpsf.Decimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MaterialTest {

    @Autowired
    private IMaterialDao materialDao;

//    public void testSave(){
//        MaterialPo materialPo = new MaterialPo();
//        materialPo.setSupplierNum("1fsafsa");
//        materialPo.setMaterialNum("gsdfgd");
//        materialPo.setMaterialName("dfsgsdfgdfsd");
//        materialPo.setWeight(1321646);
//        materialPo.setMadeBy("fdsfsadfdsa");
//        materialPo.setPicture("/adfas.png");
//        materialPo.setPackageSize("dsfadsdsf");
//        materialPo.setStock(100);
//        materialPo.setState(1);
//        materialPo.setPrice(new Decimal());
//    }
}
