package com.example.collectcitydata.controller;

import com.example.collectcitydata.service.CityDataService;
import com.example.collectcitydata.service.CountyDataService;
import com.example.collectcitydata.vo.City;
import com.example.collectcitydata.vo.County;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/19 22:49
 */
@RestController
public class CityDataController {

    @Autowired
    private CityDataService cityDataService;

    @Autowired
    private CountyDataService countyDataService;

    @RequestMapping("/weather/cityList")
    private List<City> listCity() throws Exception {
        return cityDataService.getCityData();
    }

    @RequestMapping("weather/countyList/{cityName}")
    private List<County> listCounty(@PathVariable(value = "cityName") String cityName) throws Exception {
        return countyDataService.getCountyList(cityName);
    }
}
