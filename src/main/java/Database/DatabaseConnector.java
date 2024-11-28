package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector implements DatabaseInterface{

    public static Connection connectToDatabase(String url, String user, String password) {
        try (Connection connection = DriverManager.getConnection(url, user, password)){
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Todo: Dunno if this code will be kept. Investigagion regarding databases in progress. Technology, that is to be used has not been decided yet.
    @Override
    public Connection connectToDatabase(String url) {
        return connectToDatabase("jdbc:mysql:localhost/test?", "minty", "greatsqldb");
    }
}
