package Labo3;




import javax.swing.*;

public class ShopApp {
    public static void main(String[] args) throws Exception {
        Shop shop = new Shop();
        String menu = "1. Add party item \n2. Remove party item \n3. Rent party item \n4. Return party item \n5. Repair party item \n6. Show available party items";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            switch (choice) {
                case 1: shop.addItem();
                break;
                case 2: shop.removerItem();
                break;
                case 3: shop.uitlenen();
                break;
                case 4: shop.terugbrengen();
                break;
                case 5: shop.herstellen();
                break;
                case 6: shop.showAllItems();
                break;
            }
        }
    }
}
