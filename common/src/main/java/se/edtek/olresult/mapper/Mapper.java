package se.edtek.olresult.mapper;

import se.edtek.olresult.eventormodel.ClassResult;
import se.edtek.olresult.eventormodel.Event;
import se.edtek.olresult.eventormodel.Person;
import se.edtek.olresult.internalmodel.Klass;
import se.edtek.olresult.internalmodel.Lopare;
import se.edtek.olresult.internalmodel.Resultat;
import se.edtek.olresult.internalmodel.Tavling;

import java.time.LocalDate;

public class Mapper {


    public static Lopare asLopare(Person person) {
        Lopare lopare = new Lopare();

        lopare.efternamn = person.personName.family;
        lopare.fornamn = person.personName._given();
        lopare.eventorId = person.personId.value;
        lopare.fodelseDatum = LocalDate.parse(person.birthDate.date);

        return lopare;
    }

    public static Resultat asResultat(Event event, ClassResult classResult, String personId) {

        Resultat resultat = new Resultat();

        resultat.tavling = new Tavling();
        resultat.lopare = new Lopare();
        resultat.klass = new Klass();

        return resultat;
    }

    public static Tavling asTavling(Event event) {
        Tavling tavling = new Tavling();

        return tavling;
    }
}
