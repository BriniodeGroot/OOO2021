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
        System.out.println(codingstate + "is set");
        this.codingstate = codingstate;
    }

    public String coderen(String text){
        return codingstate.coderen(text);
    }

    public String decoderen(String text){

        return this.codingstate.decoderen(text);
    }

    public Codingstate[] getlistofcodes() {
        Codingstate[] geheimschriften = new Codingstate[GeheimschriftEnum.values().length];
        GeheimschriftEnum[] enums  = GeheimschriftEnum.values();
        int i = 0;
        for (GeheimschriftEnum geheimschrift: enums) {
            try {
                Class handlerClass = Class.forName(geheimschrift.getKlasseNaam());
                Object newgeheimschrift = handlerClass.getConstructor().newInstance();
                geheimschriften[i] = (Codingstate) newgeheimschrift;
                i++;
            } catch (Exception ignored) { }
        }
        return geheimschriften;
    }
}
