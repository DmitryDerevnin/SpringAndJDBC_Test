package com.epam.controllers.administrators;

import com.epam.entities.Administrator;
import org.springframework.stereotype.Controller;

@Controller
public class RegistrationAnnounce {
    private boolean registrationIsStarted = false;

    public void startRegistration(Administrator administrator) {
        this.registrationIsStarted = true;
    }
}
