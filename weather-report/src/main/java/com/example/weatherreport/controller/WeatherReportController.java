package com.example.weatherreport.controller;

import com.example.weatherreport.service.DataClient;
import com.example.weatherreport.vo.City;
import com.example.weatherreport.vo.County;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/22 19:16
 */
@Controller
@RequestMapping("/report")
public class WeatherReportController {

    @Autowired
    private DataClient dataClient;

    @GetMapping("/{cityName}/{countyName}")
    private ModelAndView getWeatherByCountyName(@PathVariable("cityName") String cityName,@PathVariable("countyName") String countyName, Model model) throws Exception {
        //TODO
        return null;
    }

}
