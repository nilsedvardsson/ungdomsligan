package se.edtek.olresult.db;


import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import se.edtek.olresult.internalmodel.Lopare;

public interface LopareDAO {

    @SqlUpdate("insert into lopare (id, fornamn, efternamn, eventorid, fodelsedatum) values (:id, :fornamn, :efternamn, :eventorid, :fodelsedatum) ")
    void creat(@Bind("id") String id,
               @Bind("fornamn") String fornamn,
               @Bind("efternamn") String efternamn,
               @Bind("eventorid") String eventorId,
               @Bind("fodelsedatum") String fodelsedatum);

    @SqlQuery("select * from lopare where eventorid = :eventorid")
    Lopare findByEventorId(@Bind("eventorid") String eventorid);
}
