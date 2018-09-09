package com.epam.repository.DAOImpl;

import com.epam.configurations.ConnectionDB;
import com.epam.entities.SchoolSubject;
import com.epam.repository.DAO.ISchoolSubjectDAO;
import com.epam.repository.mappers.SchoolSubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class SchoolSubjectDAO implements ISchoolSubjectDAO {
    JdbcTemplate jdbcTemplate;
    @Autowired
    private SchoolSubjectMapper schoolSubjectMapper;
    private ConnectionDB testConnect;

    @Autowired
    public SchoolSubjectDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void addSchoolSubject(String subject, double score) {
        jdbcTemplate.update(
                "insert into school_subjects values (?, ?, ?)",
                null, subject, score);
    }

    @Override
    public SchoolSubject getSchoolSubject(Integer id) {
        SchoolSubject schoolSubject = jdbcTemplate.queryForObject
                ("select * from school_subjects where idSchoolSubjects = ?",
                        new Object[]{id}, schoolSubjectMapper);
        return schoolSubject;
    }

    @Override
    public List<SchoolSubject> getSchoolSubjects() {
        return jdbcTemplate.query
                ("select * from school_subjects", schoolSubjectMapper);
    }

    @Override
    public void delete(Integer id) {
        jdbcTemplate.update
                ("delete from school_subjects where idSchoolSubjects = ?", id);
    }
}
