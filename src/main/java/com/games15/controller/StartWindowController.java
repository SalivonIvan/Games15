/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.games15.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author salivon.i
 */
public class StartWindowController implements Initializable {

    @FXML
    Button button15;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    public void button15() {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), button15);
        tt.setByX(60);
        tt.play();
    }

}
