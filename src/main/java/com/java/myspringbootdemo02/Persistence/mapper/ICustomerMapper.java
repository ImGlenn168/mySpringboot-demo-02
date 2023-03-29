package com.java.myspringbootdemo02.Persistence.mapper;

import com.java.myspringbootdemo02.Common.po.CustomerPo;
import com.java.myspringbootdemo02.Common.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ICustomerMapper {

    List<CustomerPo> findAll();

    List<CustomerPo> findByPage(Map<String,Integer> map);

    int addUser(CustomerPo customerPo);
    int updateUserById(CustomerPo customerPo);

    int deleteUserById(CustomerPo customerPo);

    int batchAdd(List<CustomerPo> list);
}
