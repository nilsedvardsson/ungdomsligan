package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlElement;

public class Result {

    @XmlElement(name = "TimeDiff")
    public String timeDiff;

    @XmlElement(name = "ResultPosition")
    public int resultPosition;

    @XmlElement(name = "CompetitorStatus")
    public CompetitorStatus competitorStatus;

}
