package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlElement;

public class ResultList {

    @XmlElement(name = "Event")
    public Event event;

    @XmlElement(name = "ClassResult")
    public ClassResult classResult;


}
