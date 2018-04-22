package com.example.weatherdata.handler;

import com.example.weatherdata.exception.WeatherDataException;
import com.example.weatherdata.utils.ResultVoUtil;
import com.example.weatherdata.vo.ResultVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author CookiesEason
 * 2018/04/22 14:50
 */
@ControllerAdvice
public class WeatherDataExceptionHandler {

    @ExceptionHandler(value = WeatherDataException.class)
    @ResponseBody
    public ResultVo handlerSellerAuthorizeException(WeatherDataException e){
        return ResultVoUtil.error(e.getCode(),e.getMessage());
    }

}
