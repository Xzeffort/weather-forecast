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
import org.springframework.web.bind.annotation.ResponseBody;
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

    @GetMapping("/listCounty/{cityName}")
    @ResponseBody
    public List<County> getCountyData(@PathVariable("cityName") String cityName) throws Exception {
        return dataClient.listCounty(cityName);
    }

    @GetMapping("/{cityName}/{countyName}")
    private ModelAndView getWeatherByCountyName(@PathVariable("cityName") String cityName,@PathVariable("countyName") String countyName, Model model) throws Exception {
        model.addAttribute("cityName",cityName);
        model.addAttribute("countyName",countyName);
        model.addAttribute("cityList",dataClient.listCity());
        model.addAttribute("countyList",dataClient.listCounty(cityName));
        model.addAttribute("report", dataClient.getData(countyName).getData());
        return new ModelAndView("report", "reportModel", model);
    }

}
