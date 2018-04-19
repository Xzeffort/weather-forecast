package com.example.collectcitydata.vo;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author CookiesEason
 * 2018/04/19 22:25
 */
@Data
@XmlRootElement(name = "city")
@XmlAccessorType(XmlAccessType.FIELD)
public class City {

    @XmlAttribute(name = "name")
    private String cityName;

    @XmlElement(name = "county")
    private List<County> countyList;
}
