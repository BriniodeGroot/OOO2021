package Labo3;


import Shoprefactored.Product;
import Shoprefactored.sorteer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.TreeSet;

public class Shop {
    ArrayList<Item> items = new ArrayList<>();
    public Shop(){
      items.add(new Item("Greg"));
      items.add(new Item("Greg2"));
      items.add(new Item("Greg3"));
    }

    public void addItem(){
        String title = JOptionPane.showInputDialog("Enter the title:");
        try {
            String prijs = JOptionPane.showInputDialog("geef de prijs mee:");
            items.add(new Item(title , Double.parseDouble(prijs)));
        }catch (Exception ignored){
            JOptionPane.showMessageDialog(null, "ongeldige input");
        }
        items.add(new Item(title));
    }
    public void removerItem(){
        String index = JOptionPane.showInputDialog("Index van item:");
        String message = "ongelidge input";
        try {
           Item item = items.get(Integer.parseInt(index));
           item.verwijderen();
           message = item.getComment();
        }catch (Exception ignored){ }
        JOptionPane.showMessageDialog(null, message);
    }

    public void uitlenen(){
        String index = JOptionPane.showInputDialog("Index van item:");
        String message = "ongelidge input";
        try {
            Item item = items.get(Integer.parseInt(index));
            item.uitlenen();
            message = item.getComment();
        }catch (Exception ignored){ }
        JOptionPane.showMessageDialog(null, message);
    }

    public void terugbrengen(){
        String index = JOptionPane.showInputDialog("Index van item:");
        String beschadigd = JOptionPane.showInputDialog("Typ 1 indien het beschadigd is:");
        String message = "ongelidge input";
        try {
            Item item = items.get(Integer.parseInt(index));
            item.terugbrengen(beschadigd.equals("1"));
            message = item.getComment();
        }catch (Exception ignored){ }
        JOptionPane.showMessageDialog(null, message);
    }

    public void herstellen(){
        String index = JOptionPane.showInputDialog("Index van item:");
        String message = "ongelidge input";
        try {
            Item item = items.get(Integer.parseInt(index));
            item.herstellen();
            message = item.getComment();
        }catch (Exception ignored){ }
        JOptionPane.showMessageDialog(null, message);
    }

    public void showAllItems(){
        JOptionPane.showMessageDialog(null, "Huidige items: " + items);
    }

}
