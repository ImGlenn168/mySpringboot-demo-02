package com.java.myspringbootdemo02.Common.convert.customer;

import com.java.myspringbootdemo02.Common.dto.CustomerDTO;
import com.java.myspringbootdemo02.Common.enums.customer.CustomerStateEnum;
import com.java.myspringbootdemo02.Common.po.CustomerPo;
import org.springframework.util.ObjectUtils;

public class CustomerDtoConvert {

    public static CustomerDTO toCustomerDTO(CustomerPo customerPo) {
        CustomerDTO customerDTO = new CustomerDTO();
        if (!ObjectUtils.isEmpty(customerPo)) {
            customerDTO.setId(customerPo.getId());
            customerDTO.setCustomerNum(customerPo.getCustomerNum());
            customerDTO.setCountry(customerPo.getCountry());
            customerDTO.setCompanyName(customerPo.getCompanyName());
            customerDTO.setCompanyAddress(customerPo.getCompanyAddress());
            customerDTO.setCustomerName(customerPo.getCustomerName());
            customerDTO.setPhone(customerPo.getPhone());
            customerDTO.setWechatNum(customerPo.getWechatNum());
            customerDTO.setStateCode(CustomerStateEnum.getStateByCode(customerPo.getState()).getCode());
            customerDTO.setState(CustomerStateEnum.getStateByCode(customerPo.getState()).getState());
            customerDTO.setFollowedBy(customerPo.getFollowedBy());
            customerDTO.setDescription(customerPo.getDescription());
            customerDTO.setCreateTime(customerPo.getCreateTime());
            customerDTO.setUpdateTime(customerPo.getUpdateTime());
        }
        return customerDTO;
    }


}
