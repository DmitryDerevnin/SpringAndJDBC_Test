package com.epam.repository.DAO;


import com.epam.entities.SchoolSubject;

import java.util.List;

public interface ISchoolSubjectDAO {
    public void addSchoolSubject(String subject, double score);

    public SchoolSubject getSchoolSubject(Integer id);

    public List<SchoolSubject> getSchoolSubjects();

    public void delete(Integer id);
}
