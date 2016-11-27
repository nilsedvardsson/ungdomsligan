package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class ClassResult {

    @XmlElement(name = "EventClass")
    public EventClass eventClass;

    @XmlElement(name = "PersonResult")
    public List<PersonResult> personResult;
}
