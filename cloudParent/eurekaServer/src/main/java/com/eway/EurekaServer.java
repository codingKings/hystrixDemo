package com.eway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
* @author 程龙
* @version 创建时间：2019年11月22日 下午9:08:30
* @ClassName 类名称：
* @Description 类描述：
*/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {
    
    public static void main(String[] args) {

        SpringApplication.run(EurekaServer.class,args);
    }
    
}
