package com.example.collectcitydata.service.impl;

import com.example.collectcitydata.service.CityDataService;
import com.example.collectcitydata.util.XmlUtil;
import com.example.collectcitydata.vo.City;
import com.example.collectcitydata.vo.CityList;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/19 22:37
 */
@Service
public class CityDataServiceImpl implements CityDataService {
    @Override
    public List<City> getCityData() throws Exception {
        Resource resource = new ClassPathResource("cityList.xml");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resource.getInputStream(),"UTF-8"));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while ((line = bufferedReader.readLine())!=null){
            buffer.append(line);
        }
        bufferedReader.close();
        CityList cityList = (CityList)XmlUtil.getCityData(CityList.class,buffer.toString());
        return cityList.getCityList();
    }
}
