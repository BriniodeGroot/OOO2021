package Labo5;


import javafx.application.Application;
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
