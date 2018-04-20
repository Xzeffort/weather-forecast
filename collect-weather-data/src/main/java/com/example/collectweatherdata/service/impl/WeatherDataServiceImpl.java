package com.example.collectweatherdata.service.impl;

import com.example.collectweatherdata.service.WeatherDataService;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @author CookiesEason
 * 2018/04/20 21:03
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    private static final Long TIME_OUT=1800L;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void syncDateBycCityName(String cityName) {
        String uri = "http://wthrcdn.etouch.cn/weather_mini?city="+cityName;
        String strBody = null;
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri,String.class);
        if (responseEntity.getStatusCode() == HttpStatus.OK){
            strBody = responseEntity.getBody();
        }
        assert strBody != null;
        stringRedisTemplate.opsForValue().set(uri,strBody,TIME_OUT,TimeUnit.SECONDS);
    }
}
