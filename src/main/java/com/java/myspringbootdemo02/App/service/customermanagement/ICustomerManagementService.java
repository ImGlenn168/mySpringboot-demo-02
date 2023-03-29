package com.java.myspringbootdemo02.App.service.customermanagement;

import com.java.myspringbootdemo02.Common.dto.CustomerManagementDTO;
import com.java.myspringbootdemo02.Common.po.CustomerManagementPO;

import java.util.List;

public interface ICustomerManagementService {

    int save(CustomerManagementDTO customerManagementDTO);

    int update(CustomerManagementDTO customerManagementDTO);

    int batchDisable(List<Integer> idList);

    CustomerManagementPO get(int id);

    List<CustomerManagementPO> list();
}
