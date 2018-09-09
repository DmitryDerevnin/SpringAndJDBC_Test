package com.epam.repository.DAO;


import com.epam.entities.Enrollee;

import java.util.List;

public interface IEnrolleeDAO {
    public void addEnrollee(String name, String lastName);

    public Enrollee getEnrollee(Integer id);

    public List<Enrollee> getListOfEnrollees();

    public void delete(Integer id);
}
