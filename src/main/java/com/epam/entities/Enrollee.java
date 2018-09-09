package com.epam.entities;


public class Enrollee {
    private int enrollee_id;
    private String Name;
    private String LastName;
    private Certificate certificate;

    public Enrollee(int enrollee_id, String name, String lastName) {
        this.enrollee_id = enrollee_id;
        Name = name;
        LastName = lastName;
    }

    public int getEnrollee_id() {
        return enrollee_id;
    }

    public void setEnrollee_id(int enrollee_id) {
        this.enrollee_id = enrollee_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
}
