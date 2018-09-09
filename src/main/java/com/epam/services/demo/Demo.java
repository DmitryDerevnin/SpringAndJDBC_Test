package com.epam.services.demo;


import com.epam.entities.Administrator;
import com.epam.repository.DAOImpl.AdministratorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Demo {
    @Autowired
    private AdministratorDAO administratorDAO;

    public void start() {
        //administratorDAO.addAdministrator("Aleksandr", "Pushkin");
        //administratorDAO.delete(11);
        //System.out.println(testDAO.getAdministrator(2).getLastName());
        for (Administrator administrator : administratorDAO.getListOfAdministrators()) {
            System.out.println(administrator.getAdmininstrator_id() +
                    " " + administrator.getName() +
                    " " + administrator.getLastName());
        }
    }
}
