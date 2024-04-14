package Database;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class DatabaseConnector implements DatabaseConnectorInterface {

    public static void main(String[] args) {
        // ; separates database url from additional options and additional options from each other
        // INIT everytime the connection is built up

        String dataBasePath = "jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:test.sql';";
        DataSource dataSource = createDataSource(dataBasePath);
        Connection connection = connectToDataSource(dataSource);
//        Connection connection =  connectToDataSource("jdbc:h2:"+ dataBasePath);
    }

    @org.jetbrains.annotations.NotNull
    private static DataSource createDataSource(String url) {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl(url);
        return hikariDataSource;
    }

    public static Connection connectToDataSource(DataSource dataSource){
        try {
            Connection connection = dataSource.getConnection();
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
