package com.example.weatherdata.controller;

import com.example.weatherdata.service.WeatherDataService;
import com.example.weatherdata.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CookiesEason
 * 2018/04/22 14:42
 */
@RestController
public class WeatherDataController {

    @Autowired
    private WeatherDataService weatherDataService;

    @RequestMapping("/data/{cityName}")
    public WeatherResponse getData(@PathVariable("cityName") String cityName){
        return weatherDataService.getDataByCityName(cityName);
    }

}
