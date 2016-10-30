package se.edtek.olresult.eventormodel;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class PersonName {

    @XmlElement(name = "Family")
    public String family;

    @XmlElement(name = "Given")
    public List<Given> givens;

    public String _given() {
        if (givens == null || givens.isEmpty()) {
            return "";
        }

        for (Given given : givens) {
            if (given.sequence == 1) {
                return given.value;
            }
        }

        return "";
    }
}
