package com.example.weatherreport.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/22 19:09
 */
@Data
public class Weather implements Serializable {

    private static final long serialVersionUID = -2600373742456828181L;
    private String city;
    private String aqi;
    private String ganmao;
    private String wendu;
    private Yesterday yesterday;
    private List<Forecast> forecast;

}
