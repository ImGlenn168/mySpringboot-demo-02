package com.java.myspringbootdemo02.Persistence.mapper.impl;

import com.java.myspringbootdemo02.Common.convert.CustomerManagementDTOConvert;
import com.java.myspringbootdemo02.Common.dto.CustomerManagementDTO;
import com.java.myspringbootdemo02.Common.po.CustomerManagementPO;
import com.java.myspringbootdemo02.Domain.persistence.ICustomerManagementDao;
import com.java.myspringbootdemo02.Persistence.mapper.ICustomerManagementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerManagementMapperImpl implements ICustomerManagementDao {

    @Autowired
    private ICustomerManagementMapper customerManagementMapper;

    @Override
    public int save(CustomerManagementDTO customerManagementDTO) {
        CustomerManagementPO customerManagementPO = CustomerManagementDTOConvert.toCustomerManagementPO(customerManagementDTO);
        customerManagementMapper.save(customerManagementPO);
        return customerManagementPO.getId();
    }

    @Override
    public int update(CustomerManagementDTO customerManagementDTO) {
        CustomerManagementPO customerManagementPO = CustomerManagementDTOConvert.toCustomerManagementPO(customerManagementDTO);
        return customerManagementMapper.update(customerManagementPO);
    }

    @Override
    public int batchDisable(List<Integer> idList) {
        return customerManagementMapper.batchDisable(idList);
    }

    @Override
    public CustomerManagementPO get(int id) {
        return customerManagementMapper.get(id);
    }

    @Override
    public List<CustomerManagementPO> list() {
        return customerManagementMapper.list();
    }
}
