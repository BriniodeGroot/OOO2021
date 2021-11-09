package Labo3;

public class Verwijderd implements State {

    private Item item;


    public Verwijderd(Item item) {
        this.item = item;
    }


    @Override
    public void Uitlenen() {
        item.setComment("Deze actie is niet toegelaten");
    }

    @Override
    public void verwijderen() {
        item.setComment("Deze actie is niet toegelaten");
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
        return "Verwijderd";
    }
}
