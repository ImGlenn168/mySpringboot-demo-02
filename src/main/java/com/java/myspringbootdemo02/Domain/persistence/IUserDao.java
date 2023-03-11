package com.java.myspringbootdemo02.Domain.persistence;

import com.java.myspringbootdemo02.Common.po.AccountPO;
import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserVo;

import java.util.List;

public interface IUserDao {
     List<UserPo> findAll();

     int addUser(UserVo userVo);
}
