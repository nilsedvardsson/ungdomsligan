package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class PersonId {

    @XmlAttribute
    public String type;

    @XmlAttribute
    public String idManager;

    @XmlValue
    public String value;

}
