package wachtwoordapp;

import java.util.Comparator;
import java.util.HashMap;


public class geordendwachtwoorden implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()){ return -1; }
        if(o1.length() < o2.length()){ return 1; }
        return o1.compareTo(o2);
    }
}
