package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujianguo
 * @data 2019/7/17
 * 描述：
 */
@RestController
public class ConfigVarController {

    @Value("${test.username}")
    private String test;

    @GetMapping("/getvar")
    public String getVar(){
        return "test:>>>>"+test;
    }
}
