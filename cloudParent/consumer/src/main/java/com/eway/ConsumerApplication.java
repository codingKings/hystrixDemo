package com.eway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
* @author 程龙
* @version 创建时间：2019年11月22日 下午8:13:46
* @ClassName 类名称：
* @Description 类描述：
*/
//@EnableCircuitBreaker
//@EnableDiscoveryClient
//@SpringBootApplication
// 为了方便简便开发，注解springcloudapplication和以上3个注解等同
@SpringCloudApplication
public class ConsumerApplication {
    
    @Bean
    @LoadBalanced   //此注解的作用就是将来会内置一个拦截器，拦截restTemplate请求，地址直接写成：http://userService/user/+id
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }
}
