package Labo2.geheimschriften;

import Labo2.Geheimschrift;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Caesarcijfer extends Geheimschrift {

    private int jumps;

    public Caesarcijfer() {this("" , 10);}

    public Caesarcijfer(String text, int jumps) {
        super(text);
        this.jumps = jumps;
    }

    public void setJumps(int jumps) {
        this.jumps = jumps;
    }


    public String coderen() {
        byte[] ascii = getText().toLowerCase(Locale.ROOT).getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < ascii.length ; i++) {
            ascii[i] = (byte) (((ascii[i]-97 + jumps) % 26) + 97);
        }
        System.out.println(StandardCharsets.US_ASCII.toString());
        return new String(ascii, StandardCharsets.US_ASCII);
    }


    public String decoderen() {

        byte[] ascii =  getText().toLowerCase(Locale.ROOT).getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < ascii.length ; i++) {
            ascii[i] = (byte) (((ascii[i]-97 - (jumps % 26) + 97)));
        }
        return new String(ascii, StandardCharsets.UTF_8);
    }
}
