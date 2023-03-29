package com.java.myspringbootdemo02.Common.convert;

import com.java.myspringbootdemo02.Common.dto.CustomerManagementDTO;
import com.java.myspringbootdemo02.Common.po.CustomerManagementPO;

public class CustomerManagementConvert {

    public static CustomerManagementDTO toCustomerManagementDTO(CustomerManagementPO input) {
        CustomerManagementDTO customerManagementDTO = new CustomerManagementDTO();
        customerManagementDTO.setId(input.getId());
        customerManagementDTO.setCustomerNum(input.getCustomerNum());
        customerManagementDTO.setCountry(input.getCountry());
        customerManagementDTO.setCompanyName(input.getCompanyName());
        customerManagementDTO.setCompanyAddress(input.getCompanyAddress());
        customerManagementDTO.setCustomerName(input.getCustomerName());
        customerManagementDTO.setPhone(input.getPhone());
        customerManagementDTO.setWechatNum(input.getWechatNum());
        customerManagementDTO.setState(input.getState());
        customerManagementDTO.setFollowedBy(input.getFollowedBy());
        customerManagementDTO.setDescription(input.getDescription());
        customerManagementDTO.setCreateTime(input.getCreateTime());
        customerManagementDTO.setUpdateTime(input.getUpdateTime());
        return customerManagementDTO;
    }


}
