package com.example.weatherreport.vo;

import lombok.Data;

import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/22 19:08
 */
@Data
public class City {

    private String cityName;

    private List<County> countyList;

}
