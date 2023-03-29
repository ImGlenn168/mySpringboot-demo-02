package com.java.myspringbootdemo02.Common.convert;

import com.java.myspringbootdemo02.Common.dto.CustomerManagementDTO;
import com.java.myspringbootdemo02.Common.po.CustomerManagementPO;

public class CustomerManagementDTOConvert {

    public static CustomerManagementPO toCustomerManagementPO(CustomerManagementDTO dto) {
        CustomerManagementPO customerManagementPO = new CustomerManagementPO();
        customerManagementPO.setId(dto.getId());
        customerManagementPO.setCustomerNum(dto.getCustomerNum());
        customerManagementPO.setCountry(dto.getCountry());
        customerManagementPO.setCompanyName(dto.getCompanyName());
        customerManagementPO.setCompanyAddress(dto.getCompanyAddress());
        customerManagementPO.setCustomerName(dto.getCustomerName());
        customerManagementPO.setPhone(dto.getPhone());
        customerManagementPO.setWechatNum(dto.getWechatNum());
        customerManagementPO.setState(dto.getState());
        customerManagementPO.setFollowedBy(dto.getFollowedBy());
        customerManagementPO.setDescription(dto.getDescription());
        customerManagementPO.setCreateTime(dto.getCreateTime());
        customerManagementPO.setUpdateTime(dto.getUpdateTime());
        return customerManagementPO;
    }

}
