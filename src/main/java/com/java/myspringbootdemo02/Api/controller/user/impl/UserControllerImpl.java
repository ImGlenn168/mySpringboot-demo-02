package com.java.myspringbootdemo02.Api.controller.user.impl;

import com.java.myspringbootdemo02.Api.controller.user.UserController;
import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.App.service.user.impl.UserServiceImpl;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin("*")
public class UserControllerImpl implements UserController {

    @Autowired
    @Qualifier(value = "userService")
    private UserServiceImpl userService;

    public Result findAllUser(){
        List<UserVo> userVos = userService.findAll();
        return Result.success(userVos);
    }

    @Override
    public String test01() {
        return "测试成功！！！";
    }

    @Override
    public Result addUser(@RequestBody UserVo userVo) {
        int i = userService.addUser(userVo);
        return getResult(i);
    }

    private Result getResult(int i) {
        if (i >0){
            return Result.success("true");
        }
        return Result.fail("false");
    }

    @Override
    public Result updateUserById(UserVo userPo) {
        int i = userService.updateUserById(userPo);
        return getResult(i);
    }

    @Override
    public Result deleteUserById(UserVo user) {
        int i = userService.deleteUserById(user);
        return getResult(i);
    }
}
