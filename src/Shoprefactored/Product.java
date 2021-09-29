package Shoprefactored;

public abstract class Product {

    private final String producttitle;
    private double factor = 0;
    private int id = -1;
    private boolean uigeleend = true;

    public Product(String producttitle) {
        this.producttitle = producttitle;
    }

    public String getProducttitle() {
        return producttitle;
    }

    public int getId() {
        return id;
    }

    public double getFactor() { return factor; }

    protected void setFactor(double factor){ this.factor = factor; }

    public abstract int getRentalproduct(int days);

    public void setId(int id) {
        if(this.id == -1) this.id = id;
    }

    public boolean isUigeleend() { return uigeleend; }

    public void setUigeleend(boolean uigeleend) { this.uigeleend = uigeleend; }
}
