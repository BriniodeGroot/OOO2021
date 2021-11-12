package labo4;

public class Reklog implements Observer{
    private int total;
    public void Reklog(){

    }

    @Override
    public void update(Rekening rekening) {
        System.out.println("Nieuwe rekening geopend met nummer " + rekening.getNummer()+ "");
    }
}
