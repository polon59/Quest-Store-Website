import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClassroomDAO {

    Connection connection;
    CommonDAO commonDAO;


    public ClassroomDAO(Connection connection, CommonDAO commonDAO){
        this.connection = connection;
        this.commonDAO = commonDAO;
    }

    
    public int getIdClassroom(String classroomName){
        String findIdByClassName = "SELECT id_class FROM class_ WHERE name=?;";
        int classroomID = Integer.MAX_VALUE;

        try {
            PreparedStatement ps = connection.prepareStatement(findIdByClassName);
            ps.setString(1, classroomName);
            ResultSet result = commonDAO.getData(connection, ps);

            while (result.next()) {
                idManager = result.getInt("id_class");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classroomID;
    }

}