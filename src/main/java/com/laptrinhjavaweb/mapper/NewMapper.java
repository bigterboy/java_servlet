package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.model.NewModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewMapper implements RowMapper<NewModel> {

    @Override
    public NewModel mapRow(ResultSet resultSet) {
        try {
            NewModel newModel = new NewModel();
            newModel.setId(resultSet.getLong("id"));
            newModel.setTitle(resultSet.getString("title"));
            return newModel;
        } catch (SQLException e) {
            return null;
        }
//        results.add(newModel);
    }
}
