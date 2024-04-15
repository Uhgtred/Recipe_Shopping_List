package Database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RecipeDatabase extends DataBaseOperator{

    @Override
    ResultSet readEntries(String name) {
        return null;
    }

    @Override
    void addEntry(String name, String value) {

    }

    @Override
    void addEntry(String name) {

    }

    @Override
    void deleteEntry(String name) throws SQLException {

    }

    @Override
    void updateEntry(String name, String value) {

    }
}
