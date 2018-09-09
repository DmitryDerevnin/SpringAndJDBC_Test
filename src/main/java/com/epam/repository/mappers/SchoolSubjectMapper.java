package com.epam.repository.mappers;

import com.epam.entities.SchoolSubject;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class SchoolSubjectMapper implements RowMapper<SchoolSubject> {
    public SchoolSubject mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        SchoolSubject schoolSubject =
                new SchoolSubject(resultSet.getInt("idSchoolSubjects"),
                        resultSet.getDouble("Score"),
                        resultSet.getString("Subject"));
        return schoolSubject;
    }
}