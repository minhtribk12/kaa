//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 08:04:04 PM EET 
//


package org.kaaproject.kaa.sandbox.demo.projects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for platform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="platform">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANDROID"/>
 *     &lt;enumeration value="JAVA"/>
 *     &lt;enumeration value="CPP"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="ESP8266"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "platform")
@XmlEnum
public enum Platform {

    ANDROID,
    JAVA,
    CPP,
    C,
    ESP8266;

    public String value() {
        return name();
    }

    public static Platform fromValue(String v) {
        return valueOf(v);
    }

}
