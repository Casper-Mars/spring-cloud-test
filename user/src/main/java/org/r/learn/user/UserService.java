package org.r.learn.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author casper
 * @date 20-3-12 下午10:21
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserService {


    public static void main(String[] args) {
        SpringApplication.run(UserService.class, args);
    }

}
