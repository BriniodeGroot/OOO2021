package Labo3;

public class Beschadigd implements State {

    private Item item;

    public Beschadigd(Item item) {
        this.item = item;
    }

    @Override
    public void Uitlenen() {
        item.setComment("Deze actie is niet toegelaten");
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
        item.setState(item.getUitleenbaar());
        item.setComment(item.getNaam() + " Is nu terug uitleenbaar");
    }
    @Override
    public String toString() {
        return "Beschadigd";
    }
}
