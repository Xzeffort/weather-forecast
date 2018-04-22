package com.example.weatherdata.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author CookiesEason
 * 2018/04/22 14:23
 */
@Data
public class Forecast implements Serializable {

    private static final long serialVersionUID = 6961700063199076466L;
    private String date;
    private String high;
    private String fengli;
    private String low;
    private String fengxiang;
    private String type;

}
