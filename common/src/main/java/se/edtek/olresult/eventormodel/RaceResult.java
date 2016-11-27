package se.edtek.olresult.eventormodel;


import javax.xml.bind.annotation.XmlElement;

public class RaceResult {

    @XmlElement(name = "EventRace")
    public EventRace eventRace;

    @XmlElement(name = "Result")
    public Result result;
}
