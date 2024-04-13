package Database;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class DatabaseConnector implements DatabaseInterface{

    public static void main(String[] args) {
        // ; separates database url from additional options and additional options from each other
        // INIT everytime the connection is built up

        String dataBasePath = "jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:test.sql';";
        DataSource dataSource = createDataSource(dataBasePath);
        Connection connection = connectToDataSource(dataSource);
//        Connection connection =  connectToDataSource("jdbc:h2:"+ dataBasePath);
        try {
//       TODO: This needs to go to another class later
            //------------------------------------------------------------
            // READ FROM DATABASE
            // !!!! important: '?' is a placeholder. And it shall ALWAYS be used in order to prevent injection attacks to the database!!!!!
            PreparedStatement statement = connection.prepareStatement("select * from USERS where name = ?");
            statement.setString(1,"Lisa");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("name") + " " + resultSet.getInt("id"));
            }
            //------------------------------------------------------------
            //------------------------------------------------------------
            // INSERT INTO DATABASE
            PreparedStatement inputStatement = connection.prepareStatement("insert into USERS (name) values (?)");
            inputStatement.setString(1,"Herbert");
            int insertCount = inputStatement.executeUpdate();
            System.out.println("InsertCount: " + insertCount);
            //------------------------------------------------------------
            //------------------------------------------------------------
            // UPDATE DATABASE ENTRY
            PreparedStatement updateStatement = connection.prepareStatement("update USERS set name = ? where name = ?");
            updateStatement.setString(1,"Mongo");
            updateStatement.setString(2,"Herbert");
            int updateCount = inputStatement.executeUpdate();
            System.out.println("UpdateCount: " + updateCount);
            //------------------------------------------------------------
            //------------------------------------------------------------
            // DELETE DATABASE ENTRY
            PreparedStatement deleteStatement = connection.prepareStatement("delete from USERS where name = ?");
            updateStatement.setString(1,"Mongo");
            int deleteCount = inputStatement.executeUpdate();
            System.out.println("DeleteCount: " + deleteCount);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
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
