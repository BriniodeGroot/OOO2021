package Shoprefactored;

public class Movie extends Product{

    private final int factor = 2;

    public Movie(String producttitle) {
        super(producttitle);
        this.setFactor(3);
    }

    @Override
    public int getRentalproduct(int days) {
        int price = 5;
        int daysLeft = days - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        };
        return price;
    }


}
