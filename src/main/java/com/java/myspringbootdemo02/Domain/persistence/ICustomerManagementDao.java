package com.java.myspringbootdemo02.Domain.persistence;

import com.java.myspringbootdemo02.Common.dto.CustomerManagementDTO;
import com.java.myspringbootdemo02.Common.po.CustomerManagementPO;

import java.util.List;

public interface ICustomerManagementDao {

    int save(CustomerManagementDTO customerManagementDTO);

    int update(CustomerManagementDTO customerManagementDTO);

    int batchDisable(List<Integer> idList);

    CustomerManagementPO get(int id);

    List<CustomerManagementPO> list();
}
