package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Event {

    @XmlAttribute
    public String eventForm;

    @XmlElement(name = "EventId")
    public String eventId;

    @XmlElement(name = "Name")
    public String name;
}
