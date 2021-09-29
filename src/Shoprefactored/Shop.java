package Shoprefactored;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;

public class Shop {

    ArrayList<Product> producten = new ArrayList<>();
    int index = 0;
    public Shop() { }

    public void addproduct(){
        String title = JOptionPane.showInputDialog("Enter the title:");
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
        switch (type){
            case "M":
                Movie movie = new Movie(title);
                movie.setId(index);
                producten.add(movie);
            case "G":
                Game game = new Game(title);
                game.setId(index);
                producten.add(game);
        }
    }
    public void showproduct(){
        String id = JOptionPane.showInputDialog("Enter the id:");
        if(id.matches("[0-9]+") && Integer.parseInt(id) < this.producten.size()) {
            JOptionPane.showMessageDialog(null, producten.get(Integer.parseInt(id)).getProducttitle());
        }
    }
    public void showrentalproduct(){
        String id = JOptionPane.showInputDialog("Enter the id:");
        String days = JOptionPane.showInputDialog("Enter the days:");
        if(days.matches("[0-9]+")  && id.matches("[0-9]+") && Integer.parseInt(id) < this.producten.size()) {
            JOptionPane.showMessageDialog(null, producten.get(Integer.parseInt(id)).getRentalproduct(Integer.parseInt(days)));
        }
    }

    public void wordtuitgeleend(){
        String id = JOptionPane.showInputDialog("Enter the id:");
        String days = JOptionPane.showInputDialog("Enter the days:");
        String answer = "Dit item is niet uitgeleend";
        if(days.matches("[0-9]+")  && id.matches("[0-9]+") && Integer.parseInt(id) < this.producten.size()) {
            if(producten.get(Integer.parseInt(id)).isUigeleend()) answer = "Dit item is uitgeleend";
            JOptionPane.showMessageDialog(null, answer);
        }

    }


}
