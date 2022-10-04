package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    
    @Value("${test.txt}")  //我们从配置文件中读取test.txt的字符串值，作为test接口的返回值
    String txt;
    
    @RequestMapping("/test")
    public String test(){
        return txt;
    }
}