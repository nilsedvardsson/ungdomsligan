select
l.fornamn, l.efternamn, t.namn, t.eventclassificationid, t.eventstatusid, r.klass, r.classtypeid, r.baseclassid
from resultat r
inner join lopare l on l.eventorid = r.lopare
inner join tavling t on t.eventorid = r.tavling

