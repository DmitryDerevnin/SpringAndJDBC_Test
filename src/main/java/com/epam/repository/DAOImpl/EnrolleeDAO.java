package com.epam.repository.DAOImpl;


import com.epam.configurations.ConnectionDB;
import com.epam.entities.Enrollee;
import com.epam.repository.DAO.IEnrolleeDAO;
import com.epam.repository.mappers.EnrolleeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class EnrolleeDAO implements IEnrolleeDAO {
    JdbcTemplate jdbcTemplate;
    @Autowired
    private EnrolleeMapper enrolleeMapper;
    private ConnectionDB testConnect;

    @Autowired
    public EnrolleeDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void addEnrollee(String name, String lastName) {
        jdbcTemplate.update(
                "insert into enrollees values (?, ?, ?)",
                null, name, lastName);
    }


    @Override
    public Enrollee getEnrollee(Integer id) {
        Enrollee enrollee = jdbcTemplate.queryForObject
                ("select * from enrollees where idEnrollee = ?",
                        new Object[]{id}, enrolleeMapper);
        return enrollee;
    }

    @Override
    public List<Enrollee> getListOfEnrollees() {
        return jdbcTemplate.query("select * from enrollees", enrolleeMapper);
    }

    @Override
    public void delete(Integer id) {
        jdbcTemplate.update
                ("delete from enrollees where idEnrollee = ?", id);
    }
}
