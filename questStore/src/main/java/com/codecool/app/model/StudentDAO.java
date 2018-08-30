import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentDAO {
    Connection connection;
    CommonDAO commonDAO;


    public StudentDAO(Connection connection, CommonDAO commonDAO){
        this.connection = connection;
        this.commonDAO = commonDAO;
    }

    public String checkIfIdInTable(int id){
        String findAllIds = "SELECT id_systemuser FROM student;";
        List<Integer> allIds = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement(findAllIds);
            ResultSet result = commonDAO.getData(connection, ps);

            while (result.next()) {
                allIds.add(result.getInt("id_systemuser"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (allIds.contains(id)) {
            return "student";
            
        } else {
            return "";
        }
    }

}