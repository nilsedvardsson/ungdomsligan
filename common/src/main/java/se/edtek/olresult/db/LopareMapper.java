package se.edtek.olresult.db;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import se.edtek.olresult.internalmodel.Lopare;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class LopareMapper implements ResultSetMapper<Lopare>{

    @Override
    public Lopare map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        Lopare lopare = new Lopare();

        lopare.fornamn = resultSet.getString("fornamn");
        lopare.efternamn = resultSet.getString("efternamn");
        lopare.eventorId = resultSet.getString("eventorid");
        lopare.fodelseDatum = LocalDate.parse(resultSet.getString("fodelsdatum"));

        return lopare;
    }

}
