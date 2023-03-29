package com.java.myspringbootdemo02.Persistence.mapper;

import com.java.myspringbootdemo02.Common.po.CustomerManagementPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICustomerManagementMapper {

    int save(CustomerManagementPO customerManagementPO);

    int update(CustomerManagementPO customerManagementPO);

    int batchDisable(List<Integer> idList);

    CustomerManagementPO get(int id);

    List<CustomerManagementPO> list();
}
