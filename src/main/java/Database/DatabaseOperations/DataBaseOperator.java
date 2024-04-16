package Database.DatabaseOperations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public abstract class DataBaseOperator {
     abstract ResultSet readEntries(String name);
     abstract void addEntry(String recipeName, Map<String, List<String>> recipe);
     abstract void addEntry(String name);
     abstract void deleteEntry (String name) throws SQLException;
     abstract void updateEntry(String name, String value);
}
