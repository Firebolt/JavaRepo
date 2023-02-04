package com.medi.StudentDataRestApi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerTest {
    MainController mainController = new MainController();
    @Test
    void givesTheWelcomeMessage() {

        String response = mainController.welcome();
        assertEquals("Welcome to the student database api" , response);
    }

}