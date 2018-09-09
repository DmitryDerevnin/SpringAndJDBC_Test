package com.epam.repository.DAO;


import com.epam.entities.Administrator;

import java.util.List;

public interface IAdministratorDAO {
    public void addAdministrator(String name, String lastName);

    public Administrator getAdministrator(Integer id);

    public List<Administrator> getListOfAdministrators();

    public void delete(Integer id);
}
