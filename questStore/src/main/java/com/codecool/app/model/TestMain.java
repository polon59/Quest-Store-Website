import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMain {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/";
    private static final String DB_NAME = "newQuestStore";
    private static final String userName = "postgres";
    private static final String password = "Polon59";

    public static void main(String[] args) {
        TestMain test = new TestMain();
        
        Connection con = test.createConnection();
        System.out.println("SUCCESS");
    }
    
    public Connection createConnection() {
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
}