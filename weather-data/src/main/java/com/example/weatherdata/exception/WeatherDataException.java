package com.example.weatherdata.exception;

import lombok.Getter;

/**
 * @author CookiesEason
 * 2018/04/22 14:48
 */
@Getter
public class WeatherDataException extends RuntimeException {

    private Integer code;

    public WeatherDataException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}
