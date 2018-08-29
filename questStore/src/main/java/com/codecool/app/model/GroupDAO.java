import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GroupDAO {
    Connection connection;
    CommonDAO commonDAO;


    public GroupDAO(Connection connection, CommonDAO commonDAO){
        this.connection = connection;
        this.commonDAO = commonDAO;
    }


    public int getIdGroup(String name){
        String findIdGroup = "SELECT id_team FROM team WHERE name=?;";
        int id = Integer.MAX_VALUE;

        try {
            PreparedStatement ps = connection.prepareStatement(findIdGroup);
            ps.setString(1, name);
            ResultSet result = commonDAO.getData(connection, ps);

            while (result.next()) {
                id = result.getInt("id_team");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id;
    }


    public String getGroupName(int id){
        String findNameGroup = "SELECT name FROM team WHERE id_team=?;";
        String name = "";

        try {
            PreparedStatement ps = connection.prepareStatement(findNameGroup);
            ps.setInt(1, id);
            ResultSet result = commonDAO.getData(connection, ps);

            while (result.next()) {
                name = result.getString("name");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return name;
    }

}