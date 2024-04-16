package Database.DatabaseOperations;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class RecipeDatabase extends DataBaseOperator{


    private final Connection connection;

    public RecipeDatabase(Connection connection) {
        this.connection = connection;
    }

    @Override
    ResultSet readEntries(String name) {
        try {
            PreparedStatement statement = connection.prepareStatement("select * from RECIPES where name = ?");
            statement.setString(1, name);
            return statement.executeQuery();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    void addEntry(String recipeName, Map<String, List<String>> recipe) {
        try {
            PreparedStatement inputStatement = connection.prepareStatement("insert into RECIPES (recipeName) values (?)");
            inputStatement.setArray(1, (Array) recipe);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    void addEntry(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    void deleteEntry(String name) throws SQLException {
        try {
            PreparedStatement deleteStatement = connection.prepareStatement("delete from RECIPES where recipeName = ?");
            deleteStatement.setString(1, name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    void updateEntry(String name, String value) {
        try {
            PreparedStatement updateStatement = connection.prepareStatement("update RECIPES set name = ? where name = ?");
            updateStatement.setString(1, name);
            updateStatement.setString(2, value);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
