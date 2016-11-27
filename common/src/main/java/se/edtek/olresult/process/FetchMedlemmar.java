package se.edtek.olresult.process;

import se.edtek.olresult.db.LopareDAO;
import se.edtek.olresult.internalmodel.Lopare;

import java.util.List;
import java.util.UUID;

public class FetchMedlemmar extends AbstractProcess {


    public void run() {
        LopareDAO dao = getDBI().onDemand(LopareDAO.class);
        List<Lopare> jokLopare = getEventorClient().getLopare("198");

        jokLopare.stream().forEach(l -> dao.create(
                UUID.randomUUID().toString(),
                l.fornamn,
                l.efternamn,
                l.eventorId,
                l.fodelseDatum.toString()));
    }

    public static void main(String[] args) {
        new FetchMedlemmar().run();
    }
}
