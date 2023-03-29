package com.java.myspringbootdemo02.App.service.customermanagement.impl;

import com.java.myspringbootdemo02.App.service.customermanagement.ICustomerManagementService;
import com.java.myspringbootdemo02.Common.dto.CustomerManagementDTO;
import com.java.myspringbootdemo02.Common.po.CustomerManagementPO;
import com.java.myspringbootdemo02.Domain.persistence.ICustomerManagementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManagementServiceImpl implements ICustomerManagementService {
    @Autowired
    private ICustomerManagementDao customerManagementDao;

    @Override
    public int save(CustomerManagementDTO customerManagementDTO) {
        return customerManagementDao.save(customerManagementDTO);
    }

    @Override
    public int update(CustomerManagementDTO customerManagementDTO) {
        return customerManagementDao.update(customerManagementDTO);
    }

    @Override
    public int batchDisable(List<Integer> idList) {
        return customerManagementDao.batchDisable(idList);
    }

    @Override
    public CustomerManagementPO get(int id) {
        return customerManagementDao.get(id);
    }

    @Override
    public List<CustomerManagementPO> list() {
        return customerManagementDao.list();
    }
}
