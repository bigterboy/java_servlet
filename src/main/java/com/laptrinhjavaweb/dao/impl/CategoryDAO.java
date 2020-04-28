package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.mapper.CategoryMapper;
import com.laptrinhjavaweb.model.CategoryModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

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

//    @Override
//    public List<CategoryModel> findAll() {
//        List<CategoryModel> results = new ArrayList<>();
//        String sql = "SELECT * FROM category";
//
//        // Open connection
//        Connection connection = getConnection();
//        PreparedStatement statement = null;
//        ResultSet resultSet = null;
//        if (connection != null) {
//            try {
//                statement = connection.prepareStatement(sql);
//                resultSet = statement.executeQuery();
//
//                while (resultSet.next()) {
//                    CategoryModel categoryModel = new CategoryModel();
//                    categoryModel.setId(resultSet.getLong("id"));
//                    categoryModel.setCode(resultSet.getString("code"));
//                    categoryModel.setName(resultSet.getString("name"));
//                    results.add(categoryModel);
//                }
//
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

    @Override
    public List<CategoryModel> findAll() {
        String sql = "SELECT * FROM category";
        return query(sql,new CategoryMapper());
    }
}
