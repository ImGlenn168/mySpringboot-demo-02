package com.java.myspringbootdemo02.Domain.persistence;

import com.java.myspringbootdemo02.Common.po.CustomerPo;
import java.util.List;
import java.util.Map;

public interface ICustomerDao {
    List<CustomerPo> findAll();

    List<CustomerPo> findByPage(Map<String,Integer> map);

    int addUser(CustomerPo customerPo);
    int updateUserById(CustomerPo customerPo);

    int deleteUserById(CustomerPo customerPo);

    int batchAdd(List<CustomerPo> list);
}
