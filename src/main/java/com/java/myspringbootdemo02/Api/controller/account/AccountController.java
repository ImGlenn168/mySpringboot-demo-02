package com.java.myspringbootdemo02.Api.controller.account;

import com.java.myspringbootdemo02.Common.dto.AccountDto;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

public interface AccountController {

    @GetMapping ("account/find")
    List<AccountDto> findAll();

    @GetMapping("account/test01")
    String test01();

}
