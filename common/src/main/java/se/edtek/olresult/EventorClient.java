package se.edtek.olresult;


import se.edtek.olresult.eventormodel.PersonList;
import se.edtek.olresult.eventormodel.ResultListList;
import se.edtek.olresult.internalmodel.Lopare;
import se.edtek.olresult.internalmodel.Resultat;
import se.edtek.olresult.mapper.Mapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class EventorClient {

    String apiKey = "b05deb67157844d8bfd1f341555d70f2";
    String uri = "https://eventor.orientering.se";



    public List<Lopare> getLopare(String organisationId) {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(uri).path("api/persons/organisations/" + organisationId);

        PersonList pl = doGet(target, PersonList.class);

        return pl.persons.stream().map(p -> Mapper.asLopare(p)).collect(Collectors.toList());
    }

    public List<Resultat> getResultat(String loparId, LocalDate from, LocalDate to) {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(uri).path("api/results/person");

        String fromDate = from.toString();
        String toDate = to.toString();

        target = target.queryParam("personId", loparId).queryParam("fromDate", fromDate).queryParam("toDate", toDate);

        ResultListList rll = doGet(target, ResultListList.class);

        System.out.println("a");

        return rll.resultLists.stream().map(rl -> Mapper.asResultat(rl.event, rl.classResult, loparId)).collect(Collectors.toList());
    }

    private <T> T doGet(WebTarget target, Class<T> clazz) {
        return target.request().header("ApiKey", apiKey).get().readEntity(clazz);
    }
}
