package se.edtek.olresult.db;


import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import se.edtek.olresult.internalmodel.Lopare;
import se.edtek.olresult.internalmodel.Resultat;
import se.edtek.olresult.internalmodel.Tavling;

import java.util.List;

@RegisterMapper(ResultatMapper.class)
public interface ResultatDAO {

    @SqlUpdate("insert into resultat (id, lopare, tavling, status, placering, timediff, poangreduktion, maxpoang, poang, klass, baseclass, classtypeid, baseclassid) values (:id, :lopare, :tavling, :status, :placering, :timediff, :poangreduktion, :maxpoang, :poang, :klass, :baseclass, :classtypeid, :baseclassid) ")
    void create(@Bind("id") String id,
                @Bind("lopare") String lopare,
                @Bind("tavling") String tavling,
                @Bind("status") String status,
                @Bind("placering") int placering,
                @Bind("timediff") String timediff,
                @Bind("poangreduktion") int poangReduktion,
                @Bind("maxpoang") int maxpoang,
                @Bind("poang") int poang,
                @Bind("klass") String klass,
                @Bind("baseclass") String baseClass,
                @Bind("classtypeid") int classTypeId,
                @Bind("baseclassid") int baseClassId);

    @SqlQuery("select * from resultat where lopare = :lopare")
    List<Resultat> findByLopare(@Bind("lopare") String lopare);

    @SqlQuery("select * from resultat")
    List<Resultat> findAll();

    @SqlUpdate("delete from resultat")
    void deleteAll();
}
