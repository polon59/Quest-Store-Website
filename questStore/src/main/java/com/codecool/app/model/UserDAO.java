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
        User user = null;
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
                userEmail = result.getString("email");
                phone = result.getString("phone");
            }
            user = new User(id, name, surname, userEmail, phone);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
        
    }

    public User findUserById(int userID){
        String findById = "SELECT * FROM systemUser WHERE id_systemUser=?;";
        User user = null;
        String name = null;
        String surname = null;
        String userEmail = null;
        String phone = null;

        try {
            PreparedStatement ps = connection.prepareStatement(findById);
            ps.setInt(1, userID);
            ResultSet result = commonDAO.getData(connection, ps);

            while (result.next()) {
                userID = result.getInt("id_systemUser");
                name = result.getString("name");
                surname = result.getString("surname");
                userEmail = result.getString("email");
                phone = result.getString("phone");
            }
            user = new User(userID, name, surname, userEmail, phone);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }


    public String getName(int userID){
        User foundUser = findUserById(userID);
        String name = foundUser.getName();
        return name;
    }

    public String getSurname(int userID){
        User foundUser = findUserById(userID);
        String surname = foundUser.getSurname();
        return surname;
    }

    public String getEmail(int userID){
        User foundUser = findUserById(userID);
        String email = foundUser.getEmail();
        return email;
    }

}