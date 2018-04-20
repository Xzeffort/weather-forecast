package com.example.collectweatherdata.service;

import com.example.collectweatherdata.vo.City;
import com.example.collectweatherdata.vo.County;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/20 19:34
 */
@FeignClient(name = "weather-zuul")
public interface CityDataClient {

    @RequestMapping("/weather-city/cityList")
    List<City> listCity() throws Exception;

    @RequestMapping("/weather-city/countyList/{cityName}")
    List<County> listCounty(@PathVariable(value = "cityName") String cityName) throws Exception;

}
