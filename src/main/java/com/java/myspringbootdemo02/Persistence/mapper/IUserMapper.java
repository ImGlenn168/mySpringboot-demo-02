package com.java.myspringbootdemo02.Persistence.mapper;

import com.java.myspringbootdemo02.Common.entity.User;
import com.java.myspringbootdemo02.Common.po.AccountPO;
import com.java.myspringbootdemo02.Common.po.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface IUserMapper {

    List<UserPo> findAll();

    int addUser(UserPo userPo);

    int updateUserById(UserPo userPo);

    int deleteUserById(UserPo user);
}
