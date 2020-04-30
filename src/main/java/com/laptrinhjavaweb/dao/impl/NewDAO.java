package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.mapper.RowMapper;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.model.NewModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//public class NewDAO implements INewDAO{

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

    @Override
    public List<NewModel> findByCategoryId(Long categoryId) {

        String sql = "SELECT * FROM news WHERE categoryid = ?";

        return query(sql, new NewMapper(), categoryId);
    }

    @Override
    public Long save(NewModel newModel) {
        String sql = "insert into news(title,content,categoryid) values(?,?,?)";
        return insert(sql,newModel.getTitle(),newModel.getContent(),newModel.getCategoryId());
    }

    @Override
    public NewModel findOne(Long id) {
        String sql = "SELECT * FROM news WHERE id = ?";
        List<NewModel> newModels = query(sql, new NewMapper(), id);

        return newModels.isEmpty() ? null : newModels.get(0);
    }

//    @Override
//    public Long save(NewModel newModel) {
//
//        ResultSet resultSet = null;
//        Long id = null;
//        Connection connection = null;
//        PreparedStatement statement = null;
//        try {
//
//
//            String sql = "insert into news(title,content,categoryid) values(?,?,?)";
//
//            connection = getConnection();
//
//            connection.setAutoCommit(false);
//
//            statement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//
//            statement.setString(1, newModel.getTitle());
//            statement.setString(2, newModel.getContent());
//            statement.setLong(3, newModel.getCategoryId());
//            statement.executeUpdate();
//
//            resultSet = statement.getGeneratedKeys();
//
//            if (resultSet.next()) {
//                id = resultSet.getLong(1);
//            }
//
//            connection.commit();
//            return  id;
//        } catch (SQLException e) {
//            try {
//                if(connection != null){
//                    connection.rollback();
//                }
//            }catch (SQLException e1){
//                e1.printStackTrace();
//            }
//            return null;
//        }finally {
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//                if (statement != null) {
//                    statement.close();
//                }
//                if (resultSet != null) {
//                    resultSet.close();
//                }
//            } catch (SQLException e) {
//                return null;
//            }
//        }
//
//    }

//    public Connection getConnection() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
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
//                    newModel.setTitle(resultSet.getString("code"));
//                    results.add(newModel);
//                }
//            return results;
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
//                } catch (SQLException e) {
//                    return  null;
//                }
//            }
//        }
//        return null;
//    }

}
