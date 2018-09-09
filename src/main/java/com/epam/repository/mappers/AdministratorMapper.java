package com.epam.repository.mappers;

import com.epam.entities.Administrator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class AdministratorMapper implements RowMapper<Administrator> {
    public Administrator mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Administrator administrator =
                new Administrator(resultSet.getInt("id_administrator"),
                        resultSet.getString("name"),
                        resultSet.getString("last_name"));
        return administrator;
    }
}