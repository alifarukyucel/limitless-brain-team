package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class Controller {
    private Scene main;
    @FXML
    private Button button1;
    @FXML
    private Button scene1button1;
    @FXML
    private Button scene2button1;
    @FXML
    private Button scene3button1;
    @FXML
    private Button scene4button1;

    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;


    public void initialize() {

    }

    @FXML
    public void handleMouseEntered(Event event) {
        if(event.getSource()==button1) {
            button1.setScaleX(0.8);
            button1.setScaleY(0.8);
        } else if (event.getSource()==button2) {
            button2.setScaleX(0.8);
            button2.setScaleY(0.8);
        } else if (event.getSource()==button3) {
            button3.setScaleX(0.8);
            button3.setScaleY(0.8);
        } else if (event.getSource()==button4) {
            button4.setScaleX(0.8);
            button4.setScaleY(0.8);
        }

    }

    @FXML
    public void handleMouseExit(Event event) {
        if(event.getSource()==button1) {
            button1.setScaleX(0.7);
            button1.setScaleY(0.7);
        } else if (event.getSource()==button2) {
            button2.setScaleX(0.7);
            button2.setScaleY(0.7);
        } else if (event.getSource()==button3) {
            button3.setScaleX(0.7);
            button3.setScaleY(0.7);
        } else if (event.getSource()==button4) {
            button4.setScaleX(0.7);
            button4.setScaleY(0.7);
    }

    }

    @FXML
    public void handleMouseClicked1(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("button1scene.fxml"));
            Stage stage = (Stage) button1.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }

    }

    @FXML
    public void handleMouseClicked2(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("button2scene.fxml"));
            Stage stage = (Stage) button2.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }

    }

    @FXML
    public void handleMouseClicked3(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("button3scene.fxml"));
            Stage stage = (Stage) button3.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }

    }

    @FXML
    public void handleMouseClicked4(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("button4scene.fxml"));
            Stage stage = (Stage) button4.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }

    }

    @FXML
    public void handleMouseClickedGoBack(Event event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("mainWindow.fxml"));
            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }

    }







}
