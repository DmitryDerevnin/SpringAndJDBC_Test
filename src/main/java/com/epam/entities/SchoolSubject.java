package com.epam.entities;

public class SchoolSubject {
    private int schoolSubjectID;
    private double score;
    private String subject;

    public SchoolSubject(int idSchoolSubjects, double score, String subject) {
        this.schoolSubjectID = idSchoolSubjects;
        this.score = score;
        this.subject = subject;
    }

    public double getScore() {
        return score;
    }

    public int getSchoolSubjectID() {
        return schoolSubjectID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSchoolSubjectID(int schoolSubjectID) {
        this.schoolSubjectID = schoolSubjectID;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
