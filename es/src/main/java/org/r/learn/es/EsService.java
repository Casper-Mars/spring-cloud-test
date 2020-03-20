package org.r.learn.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author casper
 * @date 20-3-12 下午10:17
 **/
@SpringBootApplication
@EnableEurekaClient
public class EsService {


    public static void main(String[] args) {
        SpringApplication.run(EsService.class, args);
    }

}
