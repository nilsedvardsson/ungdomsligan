package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlElement;

public class EventClassification {

    @XmlElement(name = "ElementClassificationId")
    public int eventClassificationId;

    @XmlElement(name = "Name")
    public String name;

}
