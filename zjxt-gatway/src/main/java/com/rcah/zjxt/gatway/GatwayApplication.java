package com.rcah.zjxt.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableZuulServer
public class GatwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatwayApplication.class, args);
    }

}
