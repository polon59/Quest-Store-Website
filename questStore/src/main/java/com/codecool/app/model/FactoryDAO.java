import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class FactoryDAO {

    DBConnection dbConnection;
    Connection connection;
    CommonDAO commonDAO;

    UserDAO userDAO;
    ManagerDAO managerDAO;
    MentorDAO mentorDAO;
    ClassroomDAO classroomDAO;
    GroupDAO groupDAO;
    


    public FactoryDAO(){
        dbConnection = new DBConnection();
        commonDAO = new CommonDAO();
        createConnection();

        userDAO = new UserDAO(connection, commonDAO);
        managerDAO = new ManagerDAO(connection, commonDAO);
        mentorDAO = new MentorDAO(connection, commonDAO);
        classroomDAO = new ClassroomDAO(connection, commonDAO);
        groupDAO = new GroupDAO(connection, commonDAO);
    }


    private void createConnection(){
        this.connection = dbConnection.getConnection();
    }


    public UserDAO getUserDAO(){
        return this.userDAO;
    }


    public ManagerDAO getManagerDAO() {
        return this.managerDAO;
    }


    public MentorDAO getMentorDAO() {
        return this.mentorDAO;
    }


    public ClassroomDAO getClassroomDAO() {
        return this.classroomDAO;
    }


    public GroupDAO getGroupDAO() {
        return this.groupDAO;
    }
}