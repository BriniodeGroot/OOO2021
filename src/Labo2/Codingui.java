package Labo2;

import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;

public class Codingui {

    private final Codingcontext schriften = new Codingcontext();
    private final FlowPane root = new FlowPane();
    private final Scene mainScene = new Scene(root, 300, 250);
    private final Stage primaryStage;
    private final Label labeltekst = new Label("Tekst:");
    private final TextField texfieldencode = new TextField();
    private final ChoiceBox choiceBox = new ChoiceBox(FXCollections.observableArrayList(schriften.getCodingclasses()));
    private final Button encodingbutton = new Button("encode");
    private final Button decodingbutton = new Button("decode");
    private final Label encodinglabel  = new Label("encoded text will go here!");
    private final TextField textfielddecoded = new TextField();

    public Codingui(Stage primaryStage) {
        if(schriften.getlistofcodes().length == 0) throw new IllegalArgumentException("There are Coding algoritmes");
        this.primaryStage = primaryStage;
        choiceBox.getSelectionModel().selectFirst();
        encodingbutton.setOnAction(actionEvent ->  { encodingbutton(); });
        decodingbutton.setOnAction(actionEvent ->  { decodingbutton(); });
        Home();
    }

    public void Home(){

        root.getChildren().add(labeltekst);
        addwithlineBreak(texfieldencode);
        root.getChildren().add(choiceBox);
        root.getChildren().add(encodingbutton);
        root.getChildren().add(decodingbutton);
        addwithlineBreak(encodinglabel);
        addwithlineBreak(textfielddecoded);

        primaryStage.setTitle("Cijfer app");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    private void addwithlineBreak(Control control) {
        root.getChildren().add(control);
        root.getChildren().add(new Region() {{
                setPrefSize(Double.MAX_VALUE, 0.0);
        }});
    }

    private void encodingbutton(){
        schriften.setCodingstate((Codingstate) choiceBox.getSelectionModel().getSelectedItem());
        textfielddecoded.setText(schriften.coderen(texfieldencode.getText()));
    }
    private void decodingbutton(){
        textfielddecoded.setText(schriften.decoderen(texfieldencode.getText()));
    }
}
