package com.example.collectweatherdata.service.fallback;

import com.example.collectweatherdata.service.CityDataClient;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author CookiesEason
 * 2018/04/22 14:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CityDatClientFallbackTest {

    @Autowired
    private CityDataClient cityDataClient;

    @Test
    public void listCity() throws Exception {
        log.info(String.valueOf(cityDataClient.listCity()));
    }

    @Test
    public void listCounty() throws Exception {
        log.info(String.valueOf(cityDataClient.listCounty("杭州")));
    }
}