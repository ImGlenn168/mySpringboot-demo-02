package com.java.myspringbootdemo02.Api.controller.customermanagement;

import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.Common.dto.CustomerManagementDTO;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface CustomerManagementController {

    @PostMapping("/customerManagement/save")
    Result save(CustomerManagementDTO customerManagementDTO);

    @PostMapping("/customerManagement/update")
    Result update(CustomerManagementDTO customerManagementDTO);

    @PostMapping("/customerManagement/batchDisable")
    Result batchDisable(List<Integer> idList);

    @PostMapping("/customerManagement/get")
    Result get(int id);

    @PostMapping("/customerManagement/list")
    Result list();
}
