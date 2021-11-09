package Labo3;

public class Uitgeleend implements State {

    private Item item;

    public Uitgeleend(Item item) {
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
        if(beschadigd){
            item.setState(item.getBeschadigd());
            item.setComment(item.getNaam() + " staat geregistreerd als beschadigd\nDe schadevergoeding bedraagt " + String.format("%.2f", item.getAanschafprijs()/2));
        }else {
            item.setState(item.getUitleenbaar());
            item.setComment(item.getNaam() + " staat geregistreerd als uitleenbaar");
        }
    }

    @Override
    public void herstellen() {
        item.setComment("Deze actie is niet toegelaten");
    }

    @Override
    public String toString() {
        return "Uitgeleend";
    }
}
