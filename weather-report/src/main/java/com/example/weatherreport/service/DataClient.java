package com.example.weatherreport.service;

import com.example.weatherreport.vo.City;
import com.example.weatherreport.vo.County;
import com.example.weatherreport.vo.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/22 19:12
 */
@FeignClient(name = "weather-zuul")
public interface DataClient {

    @GetMapping("/weather-city/cityList")
    List<City> listCity() throws Exception;

    @GetMapping("/weather-city/countyList/{cityName}")
    List<County> listCounty(@PathVariable(value = "cityName") String cityName) throws Exception;

    @GetMapping("/weather-data/data/{cityName}")
    WeatherResponse getData(@PathVariable("cityName") String cityName);

}
