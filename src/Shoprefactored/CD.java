package Shoprefactored;

public class CD extends Product{


    public CD(String producttitle) {
        super(producttitle);
        this.setFactor(1.5);
    }

    @Override
    public int getRentalproduct(int days) {
        return days * 3;
    }


}
