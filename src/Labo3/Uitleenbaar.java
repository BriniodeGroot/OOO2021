package Labo3;

public class Uitleenbaar implements State {

    private Item item;


    public Uitleenbaar(Item item) {
        this.item = item;
    }

    @Override
    public void Uitlenen() {
        item.setState(item.getUitgeleend());
        item.setComment("De uitleenprijs is €" +  String.format("%.2f", item.getAanschafprijs()/5));
    }

    @Override
    public void verwijderen() {
       item.setState(item.getVerwijderd());
       item.setComment(item.getNaam() + " is zo net verwijderd");
    }

    @Override
    public void terugbrengen(boolean beschadigd) {
        item.setComment("Deze actie is niet toegelaten");
    }

    @Override
    public void herstellen() {
        item.setComment("Deze actie is niet toegelaten");
    }

    @Override
    public String toString() {
        return "Uitleenbaar";
    }
}
