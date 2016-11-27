package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Event")
public class Event {

    @XmlAttribute
    public String eventForm;

    @XmlElement(name = "EventId")
    public String eventId;

    @XmlElement(name = "EventClassification")
    public EventClassification eventClassification;

    @XmlElement(name = "EventClassificationId")
    public int eventClassificationId;

    @XmlElement(name = "EventStatusId")
    public int eventStatusId;

    @XmlElement(name = "Name")
    public String name;

    @XmlElement(name = "DisciplineId")
    public int disciplineId;

    @XmlElement(name = "StartDate")
    public String startDate;
}
