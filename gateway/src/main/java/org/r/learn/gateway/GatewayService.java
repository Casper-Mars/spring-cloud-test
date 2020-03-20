package org.r.learn.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author casper
 * @date 20-3-15 下午1:35
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GatewayService {


    public static void main(String[] args) {
        SpringApplication.run(GatewayService.class, args);
    }


}
