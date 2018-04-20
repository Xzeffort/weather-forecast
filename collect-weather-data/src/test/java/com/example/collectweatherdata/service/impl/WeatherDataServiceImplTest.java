package com.example.collectweatherdata.service.impl;

import com.example.collectweatherdata.service.WeatherDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author CookiesEason
 * 2018/04/20 21:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherDataServiceImplTest {

    @Autowired
    WeatherDataService weatherDataService;

    @Test
    public void syncDateBycCityName() {
        weatherDataService.syncDateBycCityName("温州");
    }
}