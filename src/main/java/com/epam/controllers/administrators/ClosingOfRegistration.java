package com.epam.controllers.administrators;

import com.epam.entities.Administrator;
import org.springframework.stereotype.Controller;

@Controller
public class ClosingOfRegistration {
    private boolean registrationIsClosed = false;

    public void closeRegistration(Administrator administrator) {
        this.registrationIsClosed = true;
    }
}
