package Labo2;

import javax.swing.*;
import java.io.File;

public class Combobox{

    private final Geheimschrift[] geheimschriften;
    private Geheimschrift currentgeheimschrift;

    public Combobox() throws Exception {

        String path = System.getProperty("user.dir") + "/src/Labo2/geheimschriften";
        File[] files = new File(path).listFiles();
        geheimschriften = new Geheimschrift[files.length];
        int i = 0;
        for (File file : files) {
            if (file.isFile()) {
                Class handlerClass = Class.forName("Labo2.geheimschriften." + file.getName().split("\\.")[0]);
                Object newgeheimschrift = handlerClass.getConstructor().newInstance();
                geheimschriften[i] = (Geheimschrift) newgeheimschrift;
                i++;
            }
        }
    }
    public void coderen(Geheimschrift geheimschrift){
        String text = JOptionPane.showInputDialog("Enter the text:");
        geheimschrift.setText(text);
        text = geheimschrift.coderen();
        JOptionPane.showMessageDialog(null, "Je gecodeerde text is " + text);

    }
    public void decoderen(Geheimschrift geheimschrift){
        String text = JOptionPane.showInputDialog("Enter the text:");
        geheimschrift.setText(text);
        text = geheimschrift.decoderen();
        JOptionPane.showMessageDialog(null, "Je gedecodeerde text is " + text);

    }
    public Geheimschrift[] toonalgoritmes(){
      return this.geheimschriften.clone();
    }

}
