package Shoprefactored;

import java.util.Comparator;

public class sorteer implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if(o1 instanceof Movie) return -1;
        if(o2 instanceof Movie) return 1;
        if(o1 instanceof Game) return -1;
        if(o2 instanceof Game) return 1;
        return 0;
    }
}
