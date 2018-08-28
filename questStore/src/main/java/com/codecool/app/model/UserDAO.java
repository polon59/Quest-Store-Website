import java.sql.Connection;
import java.sql.PreparedStatement;
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

        String updateEmail = "UPDATE systemUser SET email=? WHERE id_systemuser=?";
        try {
            PreparedStatement ps = connection.prepareStatement(updateEmail);
            ps.setString(1, newEmail);
            ps.setInt(2, id_systemuser);
            commonDAO.updateData(connection, ps);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void setPhone(String newPhone, int id_systemuser){

        String updatePhone = "UPDATE systemUser SET phone=? WHERE id_systemuser=?";
        try {
            PreparedStatement ps = connection.prepareStatement(updatePhone);
            ps.setString(1, newPhone);
            ps.setInt(2, id_systemuser);
            commonDAO.updateData(connection, ps);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User findUserByEmail(String email){

        String findByEmail = "SELECT * FROM systemUser WHERE email=?;";
        User ussr = null;
        int id = Integer.MAX_VALUE;
        String name = null;
        String surname = null;
        String userEmail = null;
        String phone = null;

        try {
            PreparedStatement ps = connection.prepareStatement(findByEmail);
            ps.setString(1, email);
            ResultSet result = commonDAO.getData(connection, ps);

            while (result.next()) {
                id = result.getInt("id_systemUser");
                name = result.getString("name");
                surname = result.getString("surname");
                userEmail = result.getString("name");
                phone = result.getString("phone");
            }
            ussr = new User(id, name, surname, userEmail, phone);
            

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ussr;
        
    }

}