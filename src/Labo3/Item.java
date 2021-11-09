package Labo3;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Item {


    private final String naam;
    private final double aanschafprijs;

    private State beschadigd = new Beschadigd(this);
    private State uitgeleend = new Uitgeleend(this);
    private State uitleenbaar = new Uitleenbaar(this);
    private State verwijderd = new Verwijderd(this);

    private State state = new Uitleenbaar(this);
    private String comment = "";


    public Item(String naam) {
        this(naam , 0.0);
    }
    public Item(String naam ,double aanschafprijs) {
        this.naam = naam;
        this.aanschafprijs = aanschafprijs;
    }

    public void uitlenen(){ this.state.Uitlenen(); }
    public void verwijderen(){ this.state.verwijderen(); }
    public void terugbrengen(Boolean beschadigd){ this.state.terugbrengen(beschadigd); }
    public void herstellen(){ this.state.herstellen(); }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getNaam() { return naam; }

    public State getState() { return state; }

    public void setState(State state) {
        this.state = state;
    }

    public double getAanschafprijs() {
        return aanschafprijs;
    }

    public State getBeschadigd() {
        return beschadigd;
    }

    public void setBeschadigd(State beschadigd) {
        this.beschadigd = beschadigd;
    }

    public State getUitgeleend() {
        return uitgeleend;
    }

    public void setUitgeleend(State uitgeleend) {
        this.uitgeleend = uitgeleend;
    }

    public State getUitleenbaar() {
        return uitleenbaar;
    }

    public void setUitleenbaar(State uitleenbaar) {
        this.uitleenbaar = uitleenbaar;
    }

    public State getVerwijderd() {
        return verwijderd;
    }

    public void setVerwijderd(State verwijderd) {
        this.verwijderd = verwijderd;
    }

    @Override
    public String toString() {
        return naam + " is momenteel " + this.getState();
    }
}
