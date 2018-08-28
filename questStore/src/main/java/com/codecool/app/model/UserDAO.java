import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDAO {

    Connection connection;
    CommonDAO commonDAO;

    public UserDAO(Connection connection){
        this.connection = connection;
        this.commonDAO = new CommonDAO();
    }

    public void setEmail(String newEmail, int id_systemuser){
        String query = "UPDATE systemUser SET email = 'nju imejl' WHERE id_systemuser = "+id_systemuser+";";
        commonDAO.updateData(connection, query);
    }

}