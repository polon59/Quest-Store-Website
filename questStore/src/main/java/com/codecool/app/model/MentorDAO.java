import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MentorDAO {
    Connection connection;
    CommonDAO commonDAO;


    public MentorDAO(Connection connection, CommonDAO commonDAO){
        this.connection = connection;
        this.commonDAO = commonDAO;
    }

    
    public int getIdMentor(int userId){
        String findByUserId = "SELECT id_mentor FROM mentor WHERE id_sustemUser=?;";
        int idMentor = Integer.MAX_VALUE;

        try {
            PreparedStatement ps = connection.prepareStatement(findByUserId);
            ps.setInt(1, userId);
            ResultSet result = commonDAO.getData(connection, ps);

            while (result.next()) {
                idMentor = result.getInt("id_mentor");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idMentor;
    }

}