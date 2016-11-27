package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlElement;

public class EventClass {

    @XmlElement(name = "Name")
    public String name;

    @XmlElement(name = "EventClassStatus")
    public String eventClassStatus;

    @XmlElement(name = "ClassTypeId")
    public int classTypeId;

    // 16, 17 vanlig
    // 18 Inskolning, u-klasser
    // 19 öppna

    @XmlElement(name = "BaseClassId")
    public int baseClassId;

    // > 100 för kortklasser

}
