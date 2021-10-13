package Labo2;

import javax.swing.*;
import java.io.File;

public class Codingui {



    private Geheimschrift currentgeheimschrift;

    public Codingui() { }

    public Geheimschrift[] toonalgoritmes(){
        String path = System.getProperty("user.dir") + "/src/Labo2/geheimschriften";
        File[] files = new File(path).listFiles();
        Geheimschrift[] geheimschriften = new Geheimschrift[files.length];
        int i = 0;
        for (File file : files) {
            try {
                if (file.isFile()) {
                    Class handlerClass = Class.forName("Labo2.geheimschriften." + file.getName().split("\\.")[0]);
                    Object newgeheimschrift = handlerClass.getConstructor().newInstance();
                    geheimschriften[i] = (Geheimschrift) newgeheimschrift;
                    i++;
                }
            }catch (Exception ignored){
            }
        }
        return geheimschriften;
    }

}
