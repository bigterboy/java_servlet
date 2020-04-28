package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.model.NewModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewDAO extends AbstractDAO<NewModel>  implements INewDAO {
    @Override
    public List<NewModel> findByCategoryId(Long categoryId) {

        String sql = "SELECT * FROM news WHERE categoryid = ?";

        return query(sql,new NewMapper(),categoryId);
    }

//    public Connection getConnection() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/newservlet";
//            String user = "root";
//            String password = "0955188388";
//            return DriverManager.getConnection(url, user, password);
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//
//    @Override
//    public List<NewModel> findByCategoryId(Long categoryId) {
//        List<NewModel> results = new ArrayList<>();
//        String sql = "SELECT * FROM category WHERE id = ?";
//
//        // Open connection
//        Connection connection = getConnection();
//        PreparedStatement statement = null;
//        ResultSet resultSet = null;
//        if (connection != null) {
//            try {
//                statement = connection.prepareStatement(sql);
//                statement.setLong(1,categoryId);
//                resultSet = statement.executeQuery();
//
//                while (resultSet.next()) {
//                    NewModel newModel = new NewModel();
//                    newModel.setId(resultSet.getLong("id"));
//                    newModel.setTitle(resultSet.getString("title"));
//                    results.add(newModel);
//                }
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    if (connection != null) {
//                        connection.close();
//                    }
//                    if (statement != null) {
//                        statement.close();
//                    }
//                    if (resultSet != null) {
//                        resultSet.close();
//                    }
//
//                } catch (SQLException e) {
//                    return  null;
//                }
//
//            }
//        }
//        return null;
//    }






}
