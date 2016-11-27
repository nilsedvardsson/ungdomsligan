package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlElement;

public class PersonResult {

    @XmlElement(name = "Person")
    public Person person;

    @XmlElement(name = "Result")
    public Result result;

    @XmlElement(name = "RaceResult")
    public RaceResult raceResult;
}
