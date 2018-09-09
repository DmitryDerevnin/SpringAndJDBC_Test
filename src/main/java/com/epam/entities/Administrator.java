package com.epam.entities;

public class Administrator {

    private int admininstrator_id;
    private String name;
    private String lastName;


    public Administrator() {
    }

    public Administrator(int admininstrator_id, String name, String lastName) {
        this.admininstrator_id = admininstrator_id;
        this.name = name;
        this.lastName = lastName;
    }

    public void setAdmininstrator_id(int admininstrator_id) {
        this.admininstrator_id = admininstrator_id;
    }

    public int getAdmininstrator_id() {
        return admininstrator_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
