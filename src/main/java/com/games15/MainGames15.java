package com.games15;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainGames15 extends Application {

    private Stage rootStage;

    @Override
    public void start(Stage stage) {
        rootStage = stage;
        
        showStartWindow();
//        StackPane root = new StackPane(new Label("Hello JavaFX World!"));
//
//        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
//        Scene scene = new Scene(root, visualBounds.getWidth(), visualBounds.getHeight());
//
//        stage.getIcons().add(new Image(MainGames15.class.getResourceAsStream("/icon.png")));
//
//        stage.setScene(scene);
//        stage.show();
    }

    public void showStartWindow() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/StartWindow.fxml"));

            Parent root = loader.load();
            Scene scene = new Scene(root);
            rootStage.setTitle("Games 15");
            rootStage.getIcons().add(new Image(MainGames15.class.getResourceAsStream("/images/iconLogo.jpg")));
            rootStage.setScene(scene);
            rootStage.show();
        } catch (IOException ex) {
            Logger.getLogger(MainGames15.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
