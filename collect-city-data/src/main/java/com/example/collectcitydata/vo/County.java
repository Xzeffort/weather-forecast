package com.example.collectcitydata.vo;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author CookiesEason
 * 2018/04/19 22:22
 */
@Data
@XmlRootElement(name = "county")
@XmlAccessorType(XmlAccessType.FIELD)
public class County {

    @XmlAttribute(name = "id")
    private String countyId;

    @XmlAttribute(name = "name")
    private String countyName;

}
