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
    public void testAddCustomer() {
        ArrayList<CustomerPo> customerPos = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            CustomerPo customerPo = setPo();
            customerPos.add(customerPo);
        }
        int i = customerDao.batchAdd(customerPos);
        if (i > 0) {
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败！");
        }
    }

    private static CustomerPo setPo() {
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
