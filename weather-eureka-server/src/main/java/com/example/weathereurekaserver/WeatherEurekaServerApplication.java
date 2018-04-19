package com.example.weathereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author CookiesEason
 */
@SpringBootApplication
@EnableEurekaServer
public class WeatherEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherEurekaServerApplication.class, args);
    }
}
