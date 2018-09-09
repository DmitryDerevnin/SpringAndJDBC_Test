package com.epam.repository.DAOImpl;

import com.epam.configurations.ConnectionDB;
import com.epam.entities.Faculty;
import com.epam.repository.DAO.IFacultyDAO;
import com.epam.repository.mappers.FacultyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class FacultyDAO implements IFacultyDAO {
    JdbcTemplate jdbcTemplate;
    @Autowired
    private FacultyMapper facultyMapper;
    private ConnectionDB testConnect;

    @Autowired
    public FacultyDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void addFaculty(String name) {
        jdbcTemplate.update(
                "insert into faculty values (?, ?)",
                null, name);
    }

    @Override
    public Faculty getFaculty(Integer id) {
        Faculty faculty = jdbcTemplate.queryForObject
                ("select * from faculty where idFaculty = ?",
                        new Object[]{id}, facultyMapper);
        return faculty;
    }

    @Override
    public List<Faculty> getListOfFaculties() {
        return jdbcTemplate.query("select * from faculty", facultyMapper);
    }

    @Override
    public void delete(Integer id) {
        jdbcTemplate.update
                ("delete from faculty where idFaculty = ?", id);
    }

    @Override
    public void addEnrolleeToFaculty(Integer id) {

    }
}
