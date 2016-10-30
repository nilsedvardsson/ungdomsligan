package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "PersonList")
public class PersonList {

    @XmlElement(name = "Person")
    public List<Person> persons;
}
