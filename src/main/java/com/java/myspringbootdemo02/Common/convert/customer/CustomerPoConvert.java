package com.java.myspringbootdemo02.Common.convert.customer;

import com.alibaba.excel.util.StringUtils;
import com.java.myspringbootdemo02.Common.dto.CustomerDTO;
import com.java.myspringbootdemo02.Common.po.CustomerPo;
import com.java.myspringbootdemo02.Common.vo.CustomerVo;
import org.springframework.util.ObjectUtils;

public class CustomerPoConvert {

    public static CustomerPo toCustomerPo(CustomerDTO dto) {
        CustomerPo customerPo = new CustomerPo();
        if (!ObjectUtils.isEmpty(dto)) {
            customerPo.setId(dto.getId());
            customerPo.setCustomerNum(dto.getCustomerNum());
            customerPo.setCountry(dto.getCountry());
            customerPo.setCompanyName(dto.getCompanyName());
            customerPo.setCompanyAddress(dto.getCompanyAddress());
            customerPo.setCustomerName(dto.getCustomerName());
            customerPo.setPhone(dto.getPhone());
            customerPo.setWechatNum(dto.getWechatNum());
            customerPo.setState(dto.getStateCode());
            customerPo.setFollowedBy(dto.getFollowedBy());
            customerPo.setDescription(dto.getDescription());
            customerPo.setCreateTime(dto.getCreateTime());
            customerPo.setUpdateTime(dto.getUpdateTime());
        }
        return customerPo;
    }

    public static CustomerPo toCustomerPo(CustomerVo customerVo) {
        CustomerPo customerPo = new CustomerPo();
        if (!ObjectUtils.isEmpty(customerVo)) {
            judgeId(customerVo, customerPo);
            customerPo.setCustomerNum(customerVo.getCustomerNum());
            customerPo.setCountry(customerVo.getCountry());
            customerPo.setCompanyName(customerVo.getCompanyName());
            customerPo.setCompanyAddress(customerVo.getCompanyAddress());
            customerPo.setCustomerName(customerVo.getCustomerName());
            customerPo.setPhone(customerVo.getPhone());
            customerPo.setWechatNum(customerVo.getWechatNum());
            customerPo.setState(customerVo.getStateCode());
            customerPo.setFollowedBy(customerVo.getFollowedBy());
            customerPo.setDescription(customerVo.getDescription());
        }
        return customerPo;
    }

    private static void judgeId(CustomerVo customerVo, CustomerPo customerPo) {
        if (!StringUtils.isEmpty(customerVo.getId())){
            customerPo.setId(Integer.parseInt(customerVo.getId()));
        }
    }

}
