package com.example.weatherreport.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author CookiesEason
 * 2018/04/22 19:09
 */
@Data
public class Yesterday implements Serializable {

    private static final long serialVersionUID = 2276478571234046211L;
    private String date;
    private String high;
    private String fx;
    private String low;
    private String fl;
    private String type;

}
