package Shoprefactored;

public class Movie extends Product{

    public Movie(String producttitle , String invuitgeleend , int index) {
        super(producttitle , invuitgeleend , index);
        this.setFactor(3);
    }
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
    @Override
    public String toString() {
        return "Type: Movie, " + super.toString();
    }


}
