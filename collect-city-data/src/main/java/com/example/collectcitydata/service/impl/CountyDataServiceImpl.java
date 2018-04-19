package com.example.collectcitydata.service.impl;

import com.example.collectcitydata.service.CityDataService;
import com.example.collectcitydata.service.CountyDataService;
import com.example.collectcitydata.vo.City;
import com.example.collectcitydata.vo.County;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/19 23:06
 */
@Service
public class CountyDataServiceImpl implements CountyDataService {

    @Autowired
    private CityDataService cityDataService;

    @Override
    public List<County> getCountyList(String cityName) throws Exception {
        List<City> cityList = cityDataService.getCityData();
        List<County> countyList = null;
        for (City city : cityList){
            if (city.getCityName().equals(cityName)){
                countyList = city.getCountyList();
            }
        }
        return countyList;
    }
}
