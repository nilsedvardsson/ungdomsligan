package se.edtek.olresult.db;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import se.edtek.olresult.internalmodel.Lopare;
import se.edtek.olresult.internalmodel.Tavling;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TavlingMapper implements ResultSetMapper<Tavling>{

    @Override
    public Tavling map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        Tavling tavling = new Tavling();

        tavling.id = resultSet.getString("id");
        tavling.namn = resultSet.getString("namn");
        tavling.eventorId = resultSet.getString("eventorid");
        tavling.eventClassificationId = resultSet.getInt("eventclassificationid");
        tavling.eventStatusId = resultSet.getInt("eventstatusid");

        return tavling;
    }

}
