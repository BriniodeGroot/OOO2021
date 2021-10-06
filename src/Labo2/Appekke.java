package Labo2;

import javax.swing.*;

public class Appekke {

    String test = "";
    public static void main(String[] args) throws Exception {
        StringBuilder menu = new StringBuilder("Kies het algortime\n");
        Combobox box = new Combobox();
        Geheimschrift[] geheimschrifts = box.toonalgoritmes();
        for (int i = 0; i < geheimschrifts.length; i++) {
            menu.append(i + 1).append(". ").append(geheimschrifts[i].getClass().getSimpleName()).append("\n");
        }
        System.out.println(menu);
        int choice = -1;
        while (choice != 0) {
            String choosealgo = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choosealgo);
            if(choice <= geheimschrifts.length && choice > 0){
                while(true){
                    String chooseaction = JOptionPane.showInputDialog("enter 1 for coding 2 for decoding");
                    if(chooseaction.equals("1")) {
                        box.coderen(geheimschrifts[choice-1]);
                        break;
                    }else if(chooseaction.equals("2")){
                        box.decoderen(geheimschrifts[choice-1]);
                    }
                }
            }
            System.out.println(choice);
        }
    }




}
