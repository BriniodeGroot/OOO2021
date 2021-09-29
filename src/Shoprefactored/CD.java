package Shoprefactored;

public class CD extends Product{

    public CD(String producttitle, String invuitgeleend, int index) {
        super(producttitle, invuitgeleend, index);
        this.setFactor(1.5);
    }

    public CD(String producttitle) {
        super(producttitle);
        this.setFactor(1.5);
    }

    @Override
    public int getRentalproduct(int days) {
        return days * 3;
    }

    @Override
    public String toString() {
        return "Type: CD, " + super.toString();
    }


}
