package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ResultListList")
public class ResultListList {

    @XmlElement(name = "ResultList")
    public List<ResultList> resultLists;
}
