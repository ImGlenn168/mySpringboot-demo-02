package com.java.myspringbootdemo02.Persistence.mapper;

import com.java.myspringbootdemo02.Common.po.AccountPO;
import com.java.myspringbootdemo02.Common.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserMapper {

    List<UserPo> findAll();

    int addUser(UserPo userPo);
}
