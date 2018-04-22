package com.example.weatherdata.service;

import com.example.weatherdata.vo.WeatherResponse;

/**
 * @author CookiesEason
 * 2018/04/22 14:33
 */
public interface WeatherDataService {

    /**
     * 暂时不实现
     * 城市ID查询
     * @param cityId
     * @return
     */
    WeatherResponse getDataByCityId(String cityId);

    /**
     * 城市名称查询
     * @param cityName
     * @return
     */
    WeatherResponse getDataByCityName(String cityName);

}
