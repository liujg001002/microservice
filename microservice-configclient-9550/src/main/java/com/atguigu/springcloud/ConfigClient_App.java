package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liujianguo
 * @data 2019/7/17
 * 描述：
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient_App {

    public static void main(String[] args) {

        SpringApplication.run(ConfigClient_App.class,args);
    }

}
