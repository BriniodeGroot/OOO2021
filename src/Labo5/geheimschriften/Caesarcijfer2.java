package Labo5.geheimschriften;

import Labo5.Codingstate;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Caesarcijfer2 implements Codingstate {

    private final int jumps;

    public Caesarcijfer2() {
        this(1);
    }

    public Caesarcijfer2(int jumps) {
        this.jumps = jumps;
    }

    public String coderen(String text) {
        byte[] ascii = text.toLowerCase(Locale.ROOT).getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < ascii.length ; i++) {
            ascii[i] = (byte) (((ascii[i]-97 + jumps) % 26) + 97);
        }
        return new String(ascii, StandardCharsets.US_ASCII);
    }


    public String decoderen(String text) {
        byte[] ascii =  text.toLowerCase(Locale.ROOT).getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < ascii.length ; i++) {
            ascii[i] = (byte) (((ascii[i]-97 - (jumps % 26) + 97)));
        }
        return new String(ascii, StandardCharsets.UTF_8);
    }
    @Override
    public String toString() {
        return "Ceasarcijfer";
    }
}
