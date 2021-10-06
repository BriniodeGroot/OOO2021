package Labo2.geheimschriften;

import Labo2.Geheimschrift;

public class Spiegeling extends Geheimschrift {
    public Spiegeling(){
        super("");
    }
    public Spiegeling(String text) {
        super(text);
    }

    @Override
    public String coderen() {
        return new StringBuilder(getText()).reverse().toString();
    }

    @Override
    public String decoderen() {
        return new StringBuilder(getText()).reverse().toString();
    }
}
