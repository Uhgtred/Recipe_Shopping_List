package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector implements DatabaseInterface{

    public static Connection connectToDatabase(String url) {
        try (Connection connection = DriverManager.getConnection(url)) {
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
