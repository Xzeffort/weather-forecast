package com.example.weatherdata.service.impl;

import com.example.weatherdata.exception.WeatherDataException;
import com.example.weatherdata.service.WeatherDataService;
import com.example.weatherdata.vo.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.regexp.internal.RE;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author CookiesEason
 * 2018/04/22 14:34
 */
@Service
@Slf4j
public class WeatherDataServiceImpl implements WeatherDataService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        return null;
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String uri = "http://wthrcdn.etouch.cn/weather_mini?city="+cityName;
        return getRes(uri);
    }

    private WeatherResponse getRes(String uri){
        String strBody = null;
        WeatherResponse weatherResponse = null;
        stringRedisTemplate.opsForValue();
        if (stringRedisTemplate.hasKey(uri)){
            log.info("获取天气数据");
            strBody = stringRedisTemplate.opsForValue().get(uri);
        }else {
            throw new WeatherDataException(400,"Redis has no data");
        }
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            weatherResponse = objectMapper.readValue(strBody,WeatherResponse.class);
        }catch (Exception e){
            log.error("Error "+e);
        }
        return weatherResponse;
    }

}
