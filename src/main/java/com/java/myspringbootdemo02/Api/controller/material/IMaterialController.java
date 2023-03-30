package com.java.myspringbootdemo02.Api.controller.material;

import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.Common.po.MaterialPo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IMaterialController {

    @PostMapping("/material/save")
    Result save(@RequestBody MaterialPo po);

    @PostMapping("/material/batchAdd")
    Result batchAdd(@RequestBody List<MaterialPo> list);

    @PostMapping("/material/disableById")
    Result disableById(@RequestBody List<Integer> idList);

    @PostMapping("/material/updateById")
    Result updateById(@RequestBody MaterialPo po);

    @PostMapping("/material/get")
    Result get(@RequestBody int id);

    @PostMapping("/material/list")
    Result list();

}
