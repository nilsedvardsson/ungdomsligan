package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Given {

    @XmlAttribute
    public int sequence;

    @XmlValue
    public String value;

}
