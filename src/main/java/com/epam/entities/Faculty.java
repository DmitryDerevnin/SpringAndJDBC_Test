package com.epam.entities;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    private int faculty_id;
    private String name = null;
    private List<Enrollee> enrolleeList = new ArrayList<>();
    private int facultySize;

    public Faculty(int faculty_id, String name, int facultySize) {
        this.faculty_id = faculty_id;
        this.name = name;
        this.facultySize = facultySize;
    }

    public int getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(int faculty_id) {
        this.faculty_id = faculty_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Enrollee> getEnrolleeList() {
        return enrolleeList;
    }

    public void setEnrolleeList(List<Enrollee> enrolleeList) {
        this.enrolleeList = enrolleeList;
    }

    public int getFacultySize() {
        return facultySize;
    }

    public void setFacultySize(int facultySize) {
        this.facultySize = facultySize;
    }
}
