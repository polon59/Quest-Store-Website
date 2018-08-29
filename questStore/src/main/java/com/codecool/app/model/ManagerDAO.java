import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ManagerDAO {
    Connection connection;
    CommonDAO commonDAO;


    public ManagerDAO(Connection connection, CommonDAO commonDAO){
        this.connection = connection;
        this.commonDAO = commonDAO;
    }
    
}