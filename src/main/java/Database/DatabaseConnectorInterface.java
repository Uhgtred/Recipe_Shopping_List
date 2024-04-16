package Database;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.sql.Connection;

public interface DatabaseConnectorInterface {

    @Contract(pure = true)
    static @Nullable Connection connectToDatabase(String url) {
        return null;
    }
}
