package com.java.myspringbootdemo02.Api.controller.customer.impl;

import com.github.pagehelper.PageHelper;
import com.java.myspringbootdemo02.Api.controller.customer.ICustomerController;
import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.App.service.customer.ICustomerService;
import com.java.myspringbootdemo02.Common.dto.CustomerDTO;
import com.java.myspringbootdemo02.Common.vo.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;

@RestController
public class CustomerControllerImpl implements ICustomerController {

    @Autowired
    // @Qualifier(value = "customerManagementService")
    private ICustomerService customerService;


    @Override
    public Result findAll() {
        return Result.success(customerService.findAll());
    }

    @Override
    public Result findByPage(int currentPage, int pageSize) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex", (currentPage - 1) * pageSize>1?(currentPage - 1) * pageSize:0);
        map.put("pageSize", pageSize);
        List<CustomerDTO> pageResult = customerService.findByPage(map);
        return Result.success(pageResult);
    }

    @Override
    public Result addCustomer(CustomerVo customerVo) {
        int i = customerService.addCustomer(customerVo);
        return Result.getResult(i);
    }

    @Override
    public Result updateCustomerById(CustomerVo customerVo) {
        boolean result = customerService.updateCustomerById(customerVo);
        return Result.result(result);
    }

    @Override
    public Result deleteCustomerById(CustomerVo customerVo) {
        int i = customerService.deleteCustomerById(customerVo);
        return Result.getResult(i);
    }

    @Override
    public Result batchAdd(List<CustomerVo> list) {
        int i = customerService.batchAdd(list);
        return Result.getResult(i);
    }

    @Override
    public Result getById(@PathVariable("id") int id) {
        CustomerDTO byId = customerService.getById(id);
        if (byId.getId()==0){
            return Result.success("该客户不存在！");
        }
        return Result.result(byId);
    }
}
