import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBConnection {
    Connection connection;
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/";
    private static final String DB_NAME = "newQuestStore";
    private static final String userName = "postgres";
    private static final String password = "Polon59";

    public DBConnection(){
        connection = createConnection();
    }

    private Connection createConnection() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(DB_URL + DB_NAME, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return c;
    }

    public Connection getConnection(){
        return this.connection;
    }
    
}