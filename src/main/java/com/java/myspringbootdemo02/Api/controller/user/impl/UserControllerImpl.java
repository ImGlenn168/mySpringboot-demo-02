package com.java.myspringbootdemo02.Api.controller.user.impl;

import com.java.myspringbootdemo02.Api.controller.user.UserController;
import com.java.myspringbootdemo02.App.service.user.impl.UserServiceImpl;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserControllerImpl implements UserController {

    @Autowired
    @Qualifier(value = "userService")
    private UserServiceImpl userService;

    public List<UserVo> findAllUser(){
        List<UserVo> userVos = userService.findAll();
        return userVos;
    }

    @Override
    public String test01() {
        return "测试成功！！！";
    }

    @Override
    public boolean addUser(UserVo userVo) {
        return userService.addUser(userVo)>0;
    }
}
