package com.java.myspringbootdemo02.App.service.user;

import com.java.myspringbootdemo02.Common.ar.AccountAr;
import com.java.myspringbootdemo02.Common.vo.UserVo;

import java.util.List;

public interface IUserService {

    List<UserVo> findAll();

    int addUser(UserVo userVo);
}
