package com.codecool.app.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CommonDAO {

    public void updateData(Connection connection, PreparedStatement ps){
        try {
            Statement stmt = connection.createStatement();
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Records created successfully");
    }

    public ResultSet getData(Connection connection, PreparedStatement ps){
        ResultSet rs = null;

        try {
            rs = ps.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }
}