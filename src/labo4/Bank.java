package labo4;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank implements Subject{

    private int index = 0;
    HashMap<Integer , Rekening> rekeningen = new HashMap<Integer , Rekening>();
    private ArrayList<Observer> observers;
    private Rekening rekening;

    public Bank(){
    }

    public void addrekening(int nummer, double saldo){
        Rekening nieuweRekening = new Rekening(nummer, saldo);
        rekeningen.put(index, nieuweRekening);
        index++;
    }

    public Rekening getRekening(int rekeningnummer){
      if(rekeningen.containsKey(rekeningnummer)){
          return rekeningen.get(rekeningnummer);
      }
        throw new IllegalArgumentException("Ongeldig rekeningnummer");
    }

    public void addobserver(Observer o){
      observers.add(o);
    }
    public void removeobserver(Observer o){
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }
    public void notifyobservers(){
        for(Observer observer: observers){
            observer.update(rekening.getSaldo());
        }
    }

    public int getSize()
    {
      return rekeningen.size();
    }

}
