package com.java.myspringbootdemo02.App.service.material.impl;

import com.java.myspringbootdemo02.App.utils.ThreadPoolUtil;
import com.java.myspringbootdemo02.Common.vo.MaterialVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@Service
public class MaterialPoolService {
    @Autowired
    private MaterialCheckService materialCheckService;


    public MaterialVo getMaterial(int id) {
        MaterialVo materialVo = null;
        // 开启多线程
        ExecutorService fixedThreadPool = ThreadPoolUtil.getFixedThreadPool();
        List<Future<MaterialVo>> futures = new ArrayList<>();
        try {
            for (int i = 0; i < 5; i++) {
                Future<MaterialVo> future = fixedThreadPool.submit(new CallableTask(i + 1, id, materialCheckService));
                futures.add(future);
            }
            for (Future<MaterialVo> future : futures) {
                while (true) {
                    if (future.isDone() && !future.isCancelled()) {
                        materialVo = future.get();
                        if (!ObjectUtils.isEmpty(materialVo)){
                            return materialVo;
                        }else {
                            break;
                        }
                    }else {
                        // 每次轮询休息1毫秒（cpu纳秒级），避免cpu告诉轮询耗空
                        Thread.sleep(100);
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return materialVo;
    }

static class CallableTask implements Callable<MaterialVo> {
    int i;
    int id;
    MaterialCheckService materialCheckService;

    public CallableTask(int i, int id, MaterialCheckService materialCheckService) {
        this.i = i;
        this.id = id;
        this.materialCheckService = materialCheckService;
    }

    @Override
    public MaterialVo call() {
        return materialCheckService.getById(i, id);
    }
}

}
