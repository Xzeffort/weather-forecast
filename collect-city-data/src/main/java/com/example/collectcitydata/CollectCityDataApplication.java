package com.example.collectcitydata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author CookiesEason
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CollectCityDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollectCityDataApplication.class, args);
    }
}
