package com.eway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import tk.mybatis.spring.annotation.MapperScan;

/**
* @author 程龙
* @version 创建时间：2019年11月22日 下午5:48:46
* @ClassName 类名称：
* @Description 类描述：
*/
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.eway.user.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
