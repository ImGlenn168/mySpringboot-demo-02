package com.java.myspringbootdemo02.Api.controller.customer;

import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.Common.dto.CustomerDTO;
import com.java.myspringbootdemo02.Common.vo.CustomerVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

public interface ICustomerController {

    @GetMapping("customer/find")
    Result findAll();

    @GetMapping("customer/findByPage")
    Result findByPage(int currentPage, int pageSize);

    @PostMapping("customer/addCustomer")
    Result addCustomer(CustomerVo customerVo);

    @PostMapping("customer/update")
    Result updateCustomerById(CustomerVo customerVo);

    @PostMapping("customer/delete")
    Result deleteCustomerById(CustomerVo customerVo);

    @PostMapping("customer/batchAdd")
    Result batchAdd(List<CustomerVo> list);

    @GetMapping("customer/get/{id}")
    Result getById(@PathVariable("id") int id);
}
