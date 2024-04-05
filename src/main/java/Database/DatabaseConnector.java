package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector implements DatabaseInterface{

    public static void main(String[] args) {
        Connection connection =  connectToDatabase("jdbc:mysql:localhost/test?", "minty", "greatsqldb");
    }

    public static Connection connectToDatabase(String url, String user, String password) {
        try (Connection connection = DriverManager.getConnection(url, user, password)){
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
