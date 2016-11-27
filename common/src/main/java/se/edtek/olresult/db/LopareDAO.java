package se.edtek.olresult.db;


import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import se.edtek.olresult.internalmodel.Lopare;

import java.util.List;

@RegisterMapper(LopareMapper.class)
public interface LopareDAO {

    @SqlUpdate("insert into lopare (id, fornamn, efternamn, eventorid, fodelsedatum) values (:id, :fornamn, :efternamn, :eventorid, :fodelsedatum) ")
    void create(@Bind("id") String id,
                @Bind("fornamn") String fornamn,
                @Bind("efternamn") String efternamn,
                @Bind("eventorid") String eventorId,
                @Bind("fodelsedatum") String fodelsedatum);

    @SqlQuery("select * from lopare")
    List<Lopare> findAll();

    @SqlQuery("select * from lopare where eventorid = :eventorid")
    Lopare findByEventorId(@Bind("eventorid") String eventorid);

    @SqlUpdate("update lopare set vinster = :vinster, hundrapoangare = :hundrapoangare, poang = :poang where id = :id")
    void setPoints(
            @Bind("id") String id,
            @Bind("vinster") int vinster,
            @Bind("hundrapoangare") int hundrapoangare,
            @Bind("poang") int poang);

    @SqlUpdate("delete from lopare")
    void deleteAll();


}
