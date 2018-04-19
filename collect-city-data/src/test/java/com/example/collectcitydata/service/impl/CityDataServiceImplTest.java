package com.example.collectcitydata.service.impl;

import com.example.collectcitydata.service.CityDataService;
import com.example.collectcitydata.vo.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author CookiesEason
 * 2018/04/19 22:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityDataServiceImplTest {

    @Autowired
    private CityDataService cityDataService;

    @Test
    public void getCityData() throws Exception {
        System.out.println(cityDataService.getCityData());
    }
}