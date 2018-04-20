package com.example.collectweatherdata.timeJob;

import com.example.collectweatherdata.service.CityDataClient;
import com.example.collectweatherdata.service.WeatherDataService;
import com.example.collectweatherdata.vo.City;
import com.example.collectweatherdata.vo.County;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

/**
 * 获取天气数据
 * @author CookiesEason
 * 2018/04/20 21:35
 */
@Slf4j
public class WeatherDataTimeJob extends QuartzJobBean {

    @Autowired
    CityDataClient cityDataClient;

    @Autowired
    WeatherDataService weatherDataService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("获取城市数据===>获取天气数据");
        try {
            List<City> cityList = cityDataClient.listCity();
            cityList.forEach(city -> city.getCountyList().forEach(
                    county -> weatherDataService.syncDateBycCityName(county.getCountyName())
            ));
        } catch (Exception e) {
            log.info("Error"+e);
        }
        log.info("获取天气数据结束");
    }
}
