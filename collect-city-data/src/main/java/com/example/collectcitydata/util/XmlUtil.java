package com.example.collectcitydata.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.Reader;
import java.io.StringReader;

/**
 * @author CookiesEason
 * 2018/04/19 22:32
 */
public class XmlUtil {

    public static final Object getCityData(Class<?>clazz,String xmlStr) throws Exception{
        Object xmlObject = null;
        Reader reader = null;
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        reader = new StringReader(xmlStr);
        xmlObject = unmarshaller.unmarshal(reader);
        reader.close();
        return xmlObject;
    }

}
