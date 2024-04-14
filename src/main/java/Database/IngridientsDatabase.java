package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IngridientsDatabase extends DataBaseOperator {

    private Connection connection;

    public IngridientsDatabase(Connection connection) {this.connection = connection;}

    @Override
    ResultSet readEntries(String name) {
        // READ FROM DATABASE
        // !!!! important: '?' is a placeholder. And it shall ALWAYS be used in order to prevent injection attacks to the database!!!!!
        try {
            PreparedStatement statement = connection.prepareStatement("select * from USERS where name = ?");
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            return resultSet;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    void addEntry(String name, String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    void addEntry(String name) {
        // INSERT INTO DATABASE
        try {

            PreparedStatement inputStatement = connection.prepareStatement("insert into USERS (name) values (?)");
            inputStatement.setString(1,"Herbert");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    void deleteEntry(String name) throws SQLException {
        // DELETE DATABASE ENTRY
        PreparedStatement deleteStatement = connection.prepareStatement("delete from USERS where name = ?");
        deleteStatement.setString(1,name);
    }

    @Override
    void updateEntry(String name, String value) {
        // UPDATE DATABASE ENTRY
        try {
            PreparedStatement updateStatement = connection.prepareStatement("update USERS set name = ? where name = ?");
            updateStatement.setString(1,name);
            updateStatement.setString(2,value);
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
