package se.edtek.olresult.db;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import se.edtek.olresult.internalmodel.BaseClass;
import se.edtek.olresult.internalmodel.Resultat;
import se.edtek.olresult.internalmodel.Tavling;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultatMapper implements ResultSetMapper<Resultat>{

    @Override
    public Resultat map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        Resultat resultat = new Resultat();

        resultat.maxpoang = resultSet.getInt("maxpoang");
        resultat.poang = resultSet.getInt("poang");
        resultat.klass = resultSet.getString("klass");
        resultat.baseClass = BaseClass.valueOf(resultSet.getString("baseclass"));
        resultat.baseClassId = resultSet.getInt("baseclassid");
        resultat.classTypeId = resultSet.getInt("classtypeid");
        resultat.efterVinnare = resultSet.getString("timediff");
        resultat.placering = resultSet.getInt("placering");
        resultat.poangReduktion = resultSet.getInt("poangreduktion");

        return resultat;
    }

}
