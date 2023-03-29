package com.java.myspringbootdemo02.Persistence.mapper.impl;

import com.java.myspringbootdemo02.Common.po.CustomerPo;
import com.java.myspringbootdemo02.Domain.persistence.ICustomerDao;
import com.java.myspringbootdemo02.Persistence.mapper.ICustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CustomerMapperImpl implements ICustomerDao {
    @Autowired
    private ICustomerMapper customerMapper;
    @Override
    public List<CustomerPo> findAll() {
        return customerMapper.findAll();
    }

    @Override
    public List<CustomerPo> findByPage(Map<String, Integer> map) {
        return customerMapper.findByPage(map);
    }

    @Override
    public int addUser(CustomerPo customerPo) {
        return 0;
    }

    @Override
    public int updateUserById(CustomerPo customerPo) {
        return 0;
    }

    @Override
    public int deleteUserById(CustomerPo customerPo) {
        return 0;
    }

    @Override
    public int batchAdd(List<CustomerPo> list) {
        return customerMapper.batchAdd(list);
    }
}
