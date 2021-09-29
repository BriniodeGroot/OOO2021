package Shoprefactored;

public class Game extends Product{


    public Game(String producttitle) {
        super(producttitle);
        this.setFactor(1);
    }

    @Override
    public int getRentalproduct(int days) {
        return days * 3;
    }


}
