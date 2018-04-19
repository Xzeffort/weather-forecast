package com.example.collectcitydata.service;

import com.example.collectcitydata.vo.County;

import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/19 23:05
 */
public interface CountyDataService {

    List<County> getCountyList(String cityName) throws Exception;

}
