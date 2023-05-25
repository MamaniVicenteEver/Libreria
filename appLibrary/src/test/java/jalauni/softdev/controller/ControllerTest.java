package jalauni.softdev.controller;

/*
 * librerias necesarias para el test
 * */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {

        @FXML
        @org.junit.jupiter.api.Test
        void onHelloButtonClick(ActionEvent actionEvent) {
            Controller controller = new Controller();
            controller.onHelloButtonClick(actionEvent);
            assertEquals("Hello World!", controller.helloButton.getText());
        }
}