package Labo2;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class CodingApp extends Application {

    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Codingui gui = new Codingui(primaryStage);
    }
    private Region lineBreak() {
        return new Region() {{
            setPrefSize(Double.MAX_VALUE, 0.0);
        }};
    }
}
