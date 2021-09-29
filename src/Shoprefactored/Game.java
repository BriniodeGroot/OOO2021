package Shoprefactored;

public class Game extends Product{
    public Game(String producttitle , String invuitgeleend, int index) {
        super(producttitle , invuitgeleend, index);
        this.setFactor(1);
    }

    public Game(String producttitle) {
        super(producttitle);
        this.setFactor(1);
    }

    @Override
    public int getRentalproduct(int days) {
        return days * 3;
    }
    @Override
    public String toString() {
        return "Type: Game, " + super.toString();
    }

}
