package com.epam.repository.mappers;


import com.epam.entities.Faculty;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class FacultyMapper implements RowMapper<Faculty> {
    public Faculty mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Faculty faculty =
                new Faculty(resultSet.getInt("idFaculty"),
                        resultSet.getString("Name"),
                        resultSet.getInt("EnrolleesLimit"));
        return faculty;
    }
}
