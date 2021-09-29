package Shoprefactored;


import javax.swing.*;

public class ShopApp {
    public static void main(String[] args) throws ClassNotFoundException {
        Shop shop = new Shop();

        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            switch (choice){
                case 1:
                    shop.addproduct();
                case 2:
                    shop.showproduct();
                case 3:
                    shop.showrentalproduct();
                case 4:
                    shop.wordtuitgeleend();
        }
    }

}
