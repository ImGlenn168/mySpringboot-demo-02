package com.java.myspringbootdemo02.App.service.customer;

import com.java.myspringbootdemo02.Common.dto.CustomerDTO;
import com.java.myspringbootdemo02.Common.vo.CustomerVo;

import java.util.List;
import java.util.Map;

public interface ICustomerService {

    List<CustomerDTO> findAll();

    List<CustomerDTO> findByPage(Map<String,Integer> map);

    int addCustomer(CustomerVo customerPo);
    boolean updateCustomerById(CustomerVo customerVo);

    int deleteCustomerById(CustomerVo customerVo);

    int batchAdd(List<CustomerVo> list);

    CustomerDTO getById(int id);
}

