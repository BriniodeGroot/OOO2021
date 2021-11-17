package Labo4;

public class Auditor implements Observer {

    @Override
    public void update(Rekening rekening) {
        System.out.println("Nieuwe rekening geopend op datum " + rekening.getAanmaakdatum() + " met nummer " + rekening.getNummer()+ " en saldo " + rekening.getSaldo());
    }
}
