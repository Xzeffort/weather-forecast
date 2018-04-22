package com.example.weatherdata.vo;

import lombok.Data;

/**
 * @author CookiesEason
 * 2018/04/22 14:32
 */
@Data
public class WeatherResponse {

    private static final long serialVersionUID = 2403996713311670827L;
    private Weather data;
    private Integer status;
    private String desc;

}
