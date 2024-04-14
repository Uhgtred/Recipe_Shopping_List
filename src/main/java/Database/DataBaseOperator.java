package Database;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DataBaseOperator {
     abstract ResultSet readEntries(String name);
     abstract void addEntry(String name, String value);
     abstract void addEntry(String name);
     abstract void deleteEntry (String name) throws SQLException;
     abstract void updateEntry(String name, String value);
}
