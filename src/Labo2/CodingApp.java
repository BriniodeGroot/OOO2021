package Labo2;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class CodingApp extends Application {

    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();
        Scene mainScene = new Scene(root, 300, 250);

        //labels

        Label title = new Label("Greg");
        System.out.println(title.getText());

        //add

        root.getChildren().add(title);

        primaryStage.setTitle("Cijfer app");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
}
