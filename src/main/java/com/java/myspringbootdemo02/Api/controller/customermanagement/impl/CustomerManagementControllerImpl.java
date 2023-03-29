package com.java.myspringbootdemo02.Api.controller.customermanagement.impl;

import com.java.myspringbootdemo02.Api.controller.customermanagement.CustomerManagementController;
import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.App.service.customermanagement.impl.CustomerManagementServiceImpl;
import com.java.myspringbootdemo02.Common.dto.CustomerManagementDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerManagementControllerImpl implements CustomerManagementController {

    @Autowired
    // @Qualifier(value = "customerManagementService")
    private CustomerManagementServiceImpl customerManagementService;

    @Override
    public Result save(CustomerManagementDTO customerManagementDTO) {
        return Result.result(customerManagementService.save(customerManagementDTO));
    }

    @Override
    public Result update(CustomerManagementDTO customerManagementDTO) {
        return Result.result(customerManagementService.update(customerManagementDTO));
    }

    @Override
    public Result batchDisable(List<Integer> idList) {
        return Result.result(customerManagementService.batchDisable(idList));
    }

    @Override
    public Result get(int id) {
        return Result.result(customerManagementService.get(id));
    }

    @Override
    public Result list() {
        return Result.result(customerManagementService.list());
    }
}
