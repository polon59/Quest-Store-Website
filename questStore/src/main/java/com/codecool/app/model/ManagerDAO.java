package com.codecool.app.model;

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
    

    public int getIdManager(int userId){
        String findByUserId = "SELECT id_manager FROM manager WHERE id_sustemUser=?;";
        int idManager = Integer.MAX_VALUE;

        try {
            PreparedStatement ps = connection.prepareStatement(findByUserId);
            ps.setInt(1, userId);
            ResultSet result = commonDAO.getData(connection, ps);

            while (result.next()) {
                idManager = result.getInt("id_manager");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idManager;
    }
    
}