package com.epam.entities;

import java.util.HashMap;
import java.util.Map;

public class Certificate {

    private Map<String, Double> schoolSubjects = new HashMap<String, Double>();

    private double averageScore;

    public Certificate(int idCertificate, Map<String, Double> schoolSubjects) {
    }

    public Map<String, Double> getSchoolSubjects() {
        return schoolSubjects;
    }

    public void setSchoolSubjects(Map<String, Double> schoolSubjects) {
        this.schoolSubjects = schoolSubjects;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
