package Labo4;
import java.time.LocalDate;
public class Rekening extends Bank{

    private int nummer;
    private double saldo = 0;
    private LocalDate aanmaakdatum;

    public Rekening(int nummer, double saldo){
        this.nummer = nummer;
        this.aanmaakdatum = LocalDate.now();
    }
    public int getNummer(){
        return nummer;
    }
    public double getSaldo(){ return saldo; }
    public LocalDate getAanmaakdatum() { return aanmaakdatum; }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


}
