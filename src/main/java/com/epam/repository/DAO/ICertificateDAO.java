package com.epam.repository.DAO;


import com.epam.entities.Certificate;
import com.epam.entities.SchoolSubject;

import java.util.List;

public interface ICertificateDAO {
    public void add(Certificate certificate);

    public List<Certificate> getAll();

    public void getCertificateByID(int id);

    public void delete(Certificate certificate);

    public void addSchoolSubjectsToCertificate(List<SchoolSubject> schoolSubjects);

}
