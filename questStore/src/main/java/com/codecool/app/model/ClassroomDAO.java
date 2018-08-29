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
        Classroom foundClassroom = findClassroom(classroomName);
        int classroomID = foundClassroom.getIDClassroom();

        return classroomID;
    }


    public Classroom findClassroom(String name){
        String findClassroom = "SELECT * FROM class_ WHERE name=?;";
        int idClassroom = Integer.MAX_VALUE;
        Classroom classroom = null;

        try {
            PreparedStatement ps = connection.prepareStatement(findClassroom);
            ps.setString(1, name);
            ResultSet result = commonDAO.getData(connection, ps);

            while (result.next()) {
                idClassroom = result.getInt("id_class");
            }
            classroom = new Classroom(name, idClassroom);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return classroom;
    }


    public String getName(int classroomId){
        String findIdByClassName = "SELECT name FROM class_ WHERE id_class=?;";
        Classroom foundClassroom = findClassroom(classroomId);
        String name = foundClassroom.getName();

        return name;
    }


    public Classroom findClassroom(int idClassroom){
        String findClassroom = "SELECT * FROM class_ WHERE id_class=?;";
        String name = "";
        Classroom classroom = null;

        try {
            PreparedStatement ps = connection.prepareStatement(findClassroom);
            ps.setInt(1, idClassroom);
            ResultSet result = commonDAO.getData(connection, ps);

            while (result.next()) {
                name = result.getString("name");
            }
            classroom = new Classroom(name, idClassroom);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return classroom;
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