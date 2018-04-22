package com.example.collectweatherdata.service.fallback;

import com.example.collectweatherdata.service.CityDataClient;
import com.example.collectweatherdata.vo.City;
import com.example.collectweatherdata.vo.County;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 熔断器==>城市数据微服务
 *
 * @author CookiesEason
 * 2018/04/22 13:47
 */
@Component
public class CityDatClientFallback implements CityDataClient {

    @Override
    public List<City> listCity() throws Exception {
        List<City> cityList = new ArrayList<>();
        List<County> countyList = new ArrayList<>();
        City city = new City();
        city.setCityName("杭州");
        County county = new County();
        county.setWeatherCode("101210101");
        county.setCountyName("杭州");
        countyList.add(county);
        city.setCountyList(countyList);
        cityList.add(city);
        return cityList;
    }

    @Override
    public List<County> listCounty(String cityName) throws Exception {
        List<County> countyList = new ArrayList<>();
        County county = new County();
        county.setWeatherCode("101210101");
        county.setCountyName("杭州");
        countyList.add(county);
        return countyList;
    }

}
