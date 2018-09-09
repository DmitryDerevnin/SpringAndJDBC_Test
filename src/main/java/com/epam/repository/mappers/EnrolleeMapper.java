package com.epam.repository.mappers;

import com.epam.entities.Enrollee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EnrolleeMapper implements RowMapper<Enrollee> {
    public Enrollee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Enrollee enrollee =
                new Enrollee(resultSet.getInt("idEnrollee"),
                        resultSet.getString("Name"),
                        resultSet.getString("LastName"));
        return enrollee;
    }
}
