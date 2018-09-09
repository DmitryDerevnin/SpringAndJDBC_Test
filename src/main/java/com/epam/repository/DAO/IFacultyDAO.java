package com.epam.repository.DAO;

import com.epam.entities.Faculty;

import java.util.List;

public interface IFacultyDAO {
    public void addFaculty(String name);

    public Faculty getFaculty(Integer id);

    public List<Faculty> getListOfFaculties();

    public void delete(Integer id);

    public void addEnrolleeToFaculty(Integer id);
}
