package com.java.myspringbootdemo02.test;

import com.java.myspringbootdemo02.App.exception.MyApplicationException;
import com.java.myspringbootdemo02.Common.po.CustomerPo;
import com.java.myspringbootdemo02.Domain.persistence.ICustomerDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomerUnitTest {

    @Autowired
    private ICustomerDao customerDao;

    @Test
    public void testFindAll() {
        List<CustomerPo> all = customerDao.findAll();
        for (CustomerPo customerPo : all) {
            System.err.println(customerPo);
        }
    }

    @Test
    public void testBatchAddCustomer() {
        ArrayList<CustomerPo> customerPos = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            CustomerPo customerPo = getPo();
            customerPos.add(customerPo);
        }
        int i = customerDao.batchAdd(customerPos);
        if (i > 0) {
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败！");
        }
    }

    @Test
    public void testFindByPage() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex", 0);
        map.put("pageSize", 5);
        List<CustomerPo> result = customerDao.findByPage(map);
        for (CustomerPo customerPo : result) {
            System.err.println(customerPo);
        }
    }

    @Test
    public void testAddCustomer() {
        CustomerPo po = getPo();
        int i = customerDao.addCustomer(po);
        if (i > 0) {
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败！");
        }
    }

    @Test
    public void testUpdateById() {
        CustomerPo po = getPo();
        po.setId(1);
        int i = customerDao.updateCustomerById(po);
        if (i > 0) {
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败！");
        }
    }

    @Test
    public void testDeleteById() {
        CustomerPo customerPo = new CustomerPo();
        customerPo.setId(5);
        int i = customerDao.deleteCustomerById(customerPo);
        if (i > 0) {
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败！");
        }
    }

    @Test
    public void testGetById() {
        CustomerPo byId = customerDao.getById(6);
        System.out.println(byId);
    }


    private static CustomerPo getPo() {
        CustomerPo customerPo = new CustomerPo();
        customerPo.setCustomerNum("154461515541651541");
        customerPo.setCountry("China");
        customerPo.setCompanyName("北京新东方");
        customerPo.setCompanyAddress("北京市朝阳区");
        customerPo.setCustomerName("俞敏洪");
        customerPo.setPassword("88888888");
        customerPo.setPhone("12325154121");
        customerPo.setWechatNum("yu21123");
        customerPo.setState(1);
        customerPo.setFollowedBy("aaaa");
        customerPo.setDescription("企业家");
        return customerPo;
    }

}
