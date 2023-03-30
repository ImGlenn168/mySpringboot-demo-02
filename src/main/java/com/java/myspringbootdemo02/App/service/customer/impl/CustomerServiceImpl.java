package com.java.myspringbootdemo02.App.service.customer.impl;

import com.java.myspringbootdemo02.App.service.customer.ICustomerService;
import com.java.myspringbootdemo02.Common.convert.customer.CustomerDtoConvert;
import com.java.myspringbootdemo02.Common.convert.customer.CustomerPoConvert;
import com.java.myspringbootdemo02.Common.dto.CustomerDTO;
import com.java.myspringbootdemo02.Common.po.CustomerPo;
import com.java.myspringbootdemo02.Common.vo.CustomerVo;
import com.java.myspringbootdemo02.Domain.persistence.ICustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerDao customerDao;


    @Override
    public List<CustomerDTO> findAll() {
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
        List<CustomerPo> customerPos = customerDao.findAll();
        for (CustomerPo customerPo : customerPos) {
            customerDTOS.add(CustomerDtoConvert.toCustomerDTO(customerPo));
        }
        return customerDTOS;
    }

    @Override
    public List<CustomerDTO> findByPage(Map<String, Integer> map) {
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
        List<CustomerPo> customerPos = customerDao.findByPage(map);
        for (CustomerPo customerPo : customerPos) {
            customerDTOS.add(CustomerDtoConvert.toCustomerDTO(customerPo));
        }
        return customerDTOS;
    }

    @Override
    public int addCustomer(CustomerVo customerVo) {
        return customerDao.addCustomer(CustomerPoConvert.toCustomerPo(customerVo));
    }

    @Override
    public boolean updateCustomerById(CustomerVo customerVo) {
        CustomerPo customerPo = CustomerPoConvert.toCustomerPo(customerVo);
        CustomerPo customerPoById = customerDao.getById(customerPo.getId());
        if (customerPo.equals(customerPoById)){
            return true;
        }
        return customerDao.updateCustomerById(customerPo)>0;
    }

    @Override
    public int deleteCustomerById(CustomerVo customerVo) {
        return customerDao.deleteCustomerById(CustomerPoConvert.toCustomerPo(customerVo));
    }

    @Override
    public int batchAdd(List<CustomerVo> list) {
        ArrayList<CustomerPo> customerPos = new ArrayList<>();
        for (CustomerVo customerVo : list) {
            customerPos.add(CustomerPoConvert.toCustomerPo(customerVo));
        }
        return customerDao.batchAdd(customerPos);
    }

    @Override
    public CustomerDTO getById(int id) {
        CustomerPo customerPo = customerDao.getById(id);
        return CustomerDtoConvert.toCustomerDTO(customerPo);
    }
}
