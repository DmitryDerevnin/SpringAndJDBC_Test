package com.epam.services.planned;/*package com.services;

import com.entity.enrollee.Enrollee;
import com.entity.faculty.Faculty;
import com.repository.DAOImpl.EnrolleeDAO;
import com.repository.DAOImpl.FacultyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//содержит абитуриентов пофакультетно
@Service
public class EnrollToFaculty {


    private List<Enrollee> enrolleeList = new ArrayList<Enrollee>();
    private int facultyLimit;
    private int limitCounter = 0;



    public void enroll(Faculty faculty, Enrollee enrollee) {


        this.facultyLimit = faculty.getFacultySize();
        double enrolleeScore = enrollee.getCertificate().getAverageScore();

        //добавляет абитуриента в список зачисленных, если у него больше баллов,
        //чем у последнего в списке
        if (limitCounter <= facultyLimit) {
            enrolleeList.add(enrollee);
            limitCounter++;
        } else {
            enrolleeList.remove(enrolleeList.size());
            int index = 0;
            for (Enrollee currentEnrollee : enrolleeList) {
                if (enrolleeScore > currentEnrollee.getCertificate().getAverageScore()) {
                    enrolleeList.add(index, enrollee);
                    limitCounter++;
                    break;
                }
                index++;
            }
        }
    }

    public List<Enrollee> getEnrolleeList() {
        return enrolleeList;
    }
}
*/