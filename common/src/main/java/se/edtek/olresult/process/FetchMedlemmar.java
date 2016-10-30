package se.edtek.olresult.process;

import org.skife.jdbi.v2.DBI;
import se.edtek.olresult.EventorClient;
import se.edtek.olresult.db.LopareDAO;
import se.edtek.olresult.internalmodel.Lopare;

import java.util.List;
import java.util.UUID;

public class FetchMedlemmar {

    public static void main(String[] args) {

        DBI dbi = new DBI("jdbc:postgresql:eventor");
        LopareDAO dao = dbi.onDemand(LopareDAO.class);


        EventorClient client = new EventorClient();

        List<Lopare> jokLopare = client.getLopare("198");


        jokLopare.stream().forEach(l -> dao.creat(
                UUID.randomUUID().toString(),
                l.fornamn,
                l.efternamn,
                l.eventorId,
                l.fodelseDatum.toString()));

        // dao.findByEventorId("16");
    }
}
