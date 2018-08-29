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
                classroomID = result.getInt("id_class");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classroomID;
    }


    public String getName(int classroomId){
        String findIdByClassName = "SELECT name FROM class_ WHERE id_class=?;";
        String name = "";

        try {
            PreparedStatement ps = connection.prepareStatement(findIdByClassName);
            ps.setInt(1, classroomId);
            ResultSet result = commonDAO.getData(connection, ps);

            while (result.next()) {
                name = result.getString("name");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
    }

    public List<Classroom> getListOfAll(){
        String getAllClassrooms = "SELECT * FROM class_";
        List<Classroom> classroomsList = new ArrayList<>();
        String name;
        int idClassroom;

        try {
            PreparedStatement ps = connection.prepareStatement(getAllClassrooms);
            ResultSet result = commonDAO.getData(connection, ps);

            while (result.next()) {
                idClassroom = result.getInt("id_class");
                name = result.getString("name");
                Classroom classroom = new Classroom(name, idClassroom);
                classroomsList.add(classroom);
            }
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classroomsList;
    }

}