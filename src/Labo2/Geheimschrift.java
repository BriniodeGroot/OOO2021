package Labo2;

public abstract class Geheimschrift {
    String text;

    public Geheimschrift(String text) {
        this.text = text;
    }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public abstract String coderen();
    public abstract String decoderen();
}
