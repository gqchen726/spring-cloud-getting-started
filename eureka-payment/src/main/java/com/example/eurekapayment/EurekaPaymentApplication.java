package com.example.eurekapayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: guoqing.chen01@hand-china.com 2021-07-14 19:15
 **/

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaPaymentApplication.class,args);
    }
}
