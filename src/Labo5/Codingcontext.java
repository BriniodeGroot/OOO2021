package Labo5;

import java.io.File;

public class Codingcontext {

    private Codingstate codingstate;
    private final Codingstate[] codingclasses;

    public Codingcontext() {
        this.codingclasses = getlistofcodes();
    }

    public Codingstate[] getCodingclasses(){
        return codingclasses;
    }

    public void setCodingstate(Codingstate codingstate) {
        this.codingstate = codingstate;
    }

    public String coderen(String text){
        return codingstate.coderen(text);
    }

    public String decoderen(String text){

        return this.codingstate.decoderen(text);
    }

    public Codingstate[] getlistofcodes() {
        String path = System.getProperty("user.dir") + "/src/Labo5/geheimschriften";
        File[] files = new File(path).listFiles();
        assert files != null;
        Codingstate[] geheimschriften = new Codingstate[files.length];
        int i = 0;
        for (File file : files) {
            try {
                if (file.isFile()) {
                    Class handlerClass = Class.forName("Labo5.geheimschriften." + file.getName().split("\\.")[0]);
                    Object newgeheimschrift = handlerClass.getConstructor().newInstance();
                    geheimschriften[i] = (Codingstate) newgeheimschrift;
                    i++;
                }
            } catch (Exception ignored) {

            }
        }
        return geheimschriften;
    }
}
