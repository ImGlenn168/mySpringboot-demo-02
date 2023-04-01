package com.java.myspringbootdemo02.Api.controller.material;

import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.Common.vo.MaterialVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IMaterialController {

    @PostMapping("/material/save")
    Result save(@RequestBody MaterialVo vo);

    @PostMapping("/material/batchAdd")
    Result batchAdd(@RequestBody List<MaterialVo> list);

    @PostMapping("/material/disableById")
    Result disableById(@RequestBody List<Integer> idList);

    @PostMapping("/material/updateById")
    Result updateById(@RequestBody MaterialVo vo);

    @PostMapping("/material/get")
    Result get(@RequestBody int id);

    @PostMapping("/material/list")
    Result list();

}
