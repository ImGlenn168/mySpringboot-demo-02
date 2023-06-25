package com.java.myspringbootdemo02.test;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import sun.net.www.http.HttpClient;

public class demo {
    public static void main(String[] args) {
        //   build   uri
        String uri = "http://10.133.192.18:8000/sap/zhttp_service?sap-client=260";   //自行填写
        //build   http   headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("datatime","20220701");
        RestTemplate restTemplate = new RestTemplate();
        headers.add("contentType", "application/json;charset=UTF-8");
        String result = restTemplate.postForObject(uri, new HttpEntity<String>(headers), String.class);
        System.out.println(result);
    }
}
