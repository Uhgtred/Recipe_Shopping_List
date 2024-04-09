package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector implements DatabaseInterface{

    public static void main(String[] args) {
        String dataBasePath = "mem:";
        Connection connection =  connectToDatabase(("jdbc:h2:"+ dataBasePath));
    }

    public static Connection connectToDatabase(String url) {
        try {
            Connection connection = DriverManager.getConnection(url);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection connectToDatabase(String url, String user, String password) {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
