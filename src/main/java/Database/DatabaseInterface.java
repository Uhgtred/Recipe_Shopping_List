package Database;

import java.sql.Connection;

public interface DatabaseInterface {
    Connection connectToDatabase(String url);
}
