package com.example.collectcitydata.service;

import com.example.collectcitydata.vo.City;

import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/19 22:34
 */
public interface CityDataService {

    public List<City> getCityData() throws Exception;

}
