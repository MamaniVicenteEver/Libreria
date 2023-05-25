package jalauni.softdev.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    public java.awt.Label helloButton;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(ActionEvent actionEvent) {
        welcomeText.setText("Welcome to JavaFX Application!");
    }



}