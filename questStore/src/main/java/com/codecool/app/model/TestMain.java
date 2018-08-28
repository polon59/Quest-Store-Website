import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMain {



    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.getConnection();
        UserDAO userDAO = new UserDAO(connection);

        userDAO.setEmail("NOWY IMEJL", 3);
        userDAO.setPhone("NOWY FOŁN", 2);
        System.out.println(userDAO.findUserByEmail("ff").toString());
        
    }

}