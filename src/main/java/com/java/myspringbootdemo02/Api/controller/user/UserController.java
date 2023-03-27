package com.java.myspringbootdemo02.Api.controller.user;

import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.Common.dto.AccountDto;
import com.java.myspringbootdemo02.Common.entity.User;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserController {

    @GetMapping ("user/find")
    Result findAllUser();

    @GetMapping("user/test01")
    String test01();

    @PostMapping("user/addUser")
    Result addUser(@RequestBody UserVo userVo);

    @PostMapping("user/update")
    Result updateUserById(@RequestBody UserVo userPo);

    @PostMapping("user/delete")
    Result deleteUserById(@RequestBody UserVo user);
}
