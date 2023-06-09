package com.java.myspringbootdemo02.External.restTemplate.randomwords.impl;

import com.alibaba.fastjson.JSON;
import com.java.myspringbootdemo02.Common.entity.RandomWords;
import com.java.myspringbootdemo02.External.restTemplate.randomwords.RandomWordsDao;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class RandomWordsDaoImpl implements RandomWordsDao {

    /**
     * 测试外部接口的
     * getWords
     *
     * @return java.lang.String
     * @author xuegao
     * @date 2023/3/29 20:12
     */
    public String getWords() {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("请求成功！！！");
        String body = restTemplate.getForEntity("https://api.uomg.com/api/rand.qinghua?format=json",
                String.class).getBody();
        RandomWords randomWords = JSON.parseObject(body, RandomWords.class);
        System.out.println(randomWords);
        return body;
    }
}
