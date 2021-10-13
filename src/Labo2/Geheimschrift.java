package Labo2;

public abstract class Geheimschrift {

    private Codingstate codingstate;

    public Geheimschrift() {
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
}
