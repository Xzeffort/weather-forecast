package com.example.collectweatherdata.vo;

import lombok.Data;

import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/19 22:25
 */
@Data
public class City {

    private String cityName;

    private List<County> countyList;
}
