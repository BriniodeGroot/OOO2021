package Shoprefactored;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class Shop {
    ArrayList<Product> producten = new ArrayList<>();
    int index = 0;
    public Shop() throws Exception { }

    public void addproduct(){
        String title = JOptionPane.showInputDialog("Enter the title:");
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game/C for cd):");
        switch (type.toUpperCase(Locale.ROOT)) {
            case "M" -> {
                Movie movie = new Movie(title);
                movie.setId(index);
                producten.add(movie);
            }
            case "G" -> {
                Game game = new Game(title);
                game.setId(index);
                producten.add(game);
            }
            case "C" -> {
                CD cd = new CD(title);
                cd.setId(index);
                producten.add(cd);
            }
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
    public void setuitgeleend(){
        String id = JOptionPane.showInputDialog("Enter the id:");
        if(id.matches("[0-9]+") && Integer.parseInt(id) < this.producten.size()) {
            producten.get(Integer.parseInt(id)).setUigeleend();
            JOptionPane.showMessageDialog(null, "Huidige status is nu: " + producten.get(Integer.parseInt(id)).isUigeleend());
        }
    }

    public void geeflijstvanproducten(){
        TreeSet<Product> treeset = new TreeSet<>(new sorteer());
        treeset.addAll(this.producten);
        JOptionPane.showMessageDialog(null, "Huidige status is nu: " +  treeset);
    }
    public void leesbestandin() throws FileNotFoundException {
        File bestand = new File("src/Shoprefactored/bestanden/shop.txt");
        Scanner scnr = new Scanner(bestand);
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            String[] data = line.split(" ");
            if(data.length == 3){
                switch (data[0]){
                    case "Movie" -> this.producten.add(new Movie(data[1] , data[2] , index));
                    case "Game" -> this.producten.add(new Game(data[1] , data[2] , index));
                    case "CD" -> this.producten.add(new CD(data[1] , data[2] , index));
                }
            }
            index++;
        }
    }
    public void schrijfbestanduit() throws Exception {
        FileWriter myWriter = new FileWriter("src/Shoprefactored/bestanden/shop.txt");
        this.producten.forEach(product -> {
            try {
                myWriter.write(product.getClass().getSimpleName() + " " + product.isUigeleend() + " " + product.getId() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        myWriter.close();
    }




}
