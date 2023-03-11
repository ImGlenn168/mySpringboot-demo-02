package com.java.myspringbootdemo02.Api.controller.user;

import com.java.myspringbootdemo02.Common.dto.AccountDto;
import com.java.myspringbootdemo02.Common.entity.User;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserController {

    @GetMapping ("user/find")
    List<UserVo> findAllUser();

    @GetMapping("user/test01")
    String test01();

    @PostMapping("user/addUser")
    boolean addUser(@RequestBody UserVo userVo);
}
