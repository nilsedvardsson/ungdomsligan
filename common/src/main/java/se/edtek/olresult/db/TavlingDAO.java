package se.edtek.olresult.db;


import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import se.edtek.olresult.internalmodel.Lopare;
import se.edtek.olresult.internalmodel.Tavling;

import java.util.List;

@RegisterMapper(TavlingMapper.class)
public interface TavlingDAO {

    @SqlUpdate("insert into tavling (id, eventorid, namn, eventclassificationid, eventstatusid, eventform) values (:id, :eventorid, :namn, :eventclassificationid, :eventstatusid, :eventform) ")
    void create(
            @Bind("id") String id,
            @Bind("eventorid") String eventorId,
            @Bind("namn") String namn,
            @Bind("eventclassificationid") int eventClassificationId,
            @Bind("eventstatusid") int eventStatusId,
            @Bind("eventform") String eventForm);

    @SqlUpdate("update tavling set disciplineid = :disciplineid where eventorid = :eventorid")
    void update(@Bind("eventorid") String eventorid, @Bind("disciplineid") int disciplineId);

    @SqlQuery("select * from tavling")
    List<Tavling> findAll();

    @SqlQuery("select * from tavling where eventorid = :eventorid")
    Tavling findByEventorId(@Bind("eventorid") String eventorid);

    @SqlUpdate("delete from tavling")
    void deleteAll();


}
