package com.example.collectweatherdata.service;

/**
 * @author CookiesEason
 * 2018/04/20 19:55
 */
public interface WeatherDataService {

    /**
     * 通过城市名称获取天气信息
     * @param cityName
     */
    void syncDateBycCityName(String cityName);

}
