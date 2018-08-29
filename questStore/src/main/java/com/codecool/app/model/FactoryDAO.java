import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class FactoryDAO {

    Connection connection;
    DBConnection dbConnection;
    UserDAO userDAO;


    public FactoryDAO(){
        dbConnection = new DBConnection();
        connection = createConnection();
        userDAO = new UserDAO(connection);
    }


    private void createConnection(){
        connection = dbConnection.getConnection();
    }


    public UserDAO getUserDAO(){
        return this.userDAO;
    }
}