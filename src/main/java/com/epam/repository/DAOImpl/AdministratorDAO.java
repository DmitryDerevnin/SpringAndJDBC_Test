package com.epam.repository.DAOImpl;

import com.epam.configurations.ConnectionDB;
import com.epam.entities.Administrator;
import com.epam.repository.DAO.IAdministratorDAO;
import com.epam.repository.mappers.AdministratorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class AdministratorDAO implements IAdministratorDAO {
    JdbcTemplate jdbcTemplate;
    @Autowired
    private AdministratorMapper administratorMapper;
    private ConnectionDB testConnect;

    @Autowired
    public AdministratorDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void addAdministrator(String name, String lastName) {
        jdbcTemplate.update(
                "insert into administrators values (?, ?, ?)",
                null, name, lastName);
    }

    @Override
    public Administrator getAdministrator(Integer id) {
        Administrator administrator = jdbcTemplate.queryForObject
                ("select * from administrators where id_administrator = ?",
                        new Object[]{id}, administratorMapper);
        return administrator;
    }

    @Override
    public List<Administrator> getListOfAdministrators() {
        return jdbcTemplate.query
                ("select * from administrators", administratorMapper);
    }

    @Override
    public void delete(Integer id) {
        jdbcTemplate.update
                ("delete from administrators where id_administrator = ?", id);
    }
}
