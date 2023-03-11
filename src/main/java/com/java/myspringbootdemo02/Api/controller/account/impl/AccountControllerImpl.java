package com.java.myspringbootdemo02.Api.controller.account.impl;

import com.java.myspringbootdemo02.Api.controller.account.AccountController;
import com.java.myspringbootdemo02.Common.ar.AccountAr;
import com.java.myspringbootdemo02.Common.dto.AccountDto;
import com.java.myspringbootdemo02.App.service.account.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountControllerImpl implements AccountController {

    @Autowired
    @Qualifier(value = "accountService")
    private AccountServiceImpl accountService;

    public List<AccountDto> findAll(){
        List<AccountAr> arList = accountService.findAll();
        List<AccountDto> accountDtos = new ArrayList<>();
        for (AccountAr account : arList) {
            accountDtos.add(new AccountDto(account.getId(), account.getName(), account.getMoney()));
        }
        return accountDtos;
    }

    @Override
    public String test01() {
        return "测试成功！！！";
    }
}
