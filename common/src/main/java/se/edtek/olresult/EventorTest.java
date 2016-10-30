package se.edtek.olresult;

import se.edtek.olresult.internalmodel.Lopare;

import java.time.LocalDate;
import java.util.List;

public class EventorTest {


    public static void main(String[] args) throws Exception {


        EventorClient ec = new EventorClient();
        ec.getResultat("16", LocalDate.of(2016,5, 1), LocalDate.of(2016, 8, 1));

    }

    public static void fetchMedlemmar() {
        EventorClient ec = new EventorClient();

        List<Lopare> ls = ec.getLopare("198");
        for (Lopare l : ls) {
            System.out.println(l.eventorId + " " + l.fornamn + " " + l.efternamn + " " + l.fodelseDatum);
        }
    }

    public static void fetchResultat(String loparId) {
        LocalDate from = LocalDate.of(2016,1,1);
        LocalDate to = LocalDate.of(2016,12,31);

        EventorClient client = new EventorClient();
        client.getResultat(loparId, from, to);

    }
}
