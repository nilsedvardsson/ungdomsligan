package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Person {

    @XmlAttribute
    public String sex;

    @XmlElement(name = "PersonId")
    public PersonId personId;

    @XmlElement(name = "PersonName")
    public PersonName personName;

    @XmlElement(name = "BirthDate")
    public BirthDate birthDate;
}
