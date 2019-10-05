select
l.fornamn, l.efternamn, t.namn, t.eventclassificationid, t.eventstatusid, r.klass, r.classtypeid, r.baseclassid
from resultat r
inner join lopare l on l.eventorid = r.lopare
inner join tavling t on t.eventorid = r.tavling

select l.fornamn, l.efternamn, l.fodelsedatum, l.poang, l.vinster, l.hundrapoangare from lopare l
where l.fodelsedatum > '2002-01-01'
order by l.poang desc, l.vinster desc, l.hundrapoangare desc;


select  l.fornamn, l.efternamn, l.fodelsedatum, l.poang, l.vinster, l.hundrapoangare into tmp from lopare l
where l.fodelsedatum > '2001-12-31' and l.fodelsedatum < '2010-01-01'
order by l.poang desc, l.vinster desc, l.hundrapoangare desc;

COPY tmp TO '/Users/nils/ungdomsligan.csv' DELIMITER ',' CSV HEADER;