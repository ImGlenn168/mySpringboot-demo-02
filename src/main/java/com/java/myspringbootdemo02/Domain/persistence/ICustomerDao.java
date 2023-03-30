package com.java.myspringbootdemo02.Domain.persistence;

import com.java.myspringbootdemo02.Common.po.CustomerPo;
import java.util.List;
import java.util.Map;

public interface ICustomerDao {
    List<CustomerPo> findAll();

    List<CustomerPo> findByPage(Map<String,Integer> map);

    int addCustomer(CustomerPo customerPo);
    int updateCustomerById(CustomerPo customerPo);

    int deleteCustomerById(CustomerPo customerPo);

    int batchAdd(List<CustomerPo> list);

    CustomerPo getById(int id);
}
