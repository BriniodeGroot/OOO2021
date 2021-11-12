package labo4;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank implements Subject{

    private int index = 0;
    private HashMap<Integer , Rekening> rekeningen = new HashMap<Integer , Rekening>();
    private ArrayList<Observer> observers;

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
        observers.remove(o);
    }
    public void notifyobservers(int index){
        for(Observer observer: observers){
            observer.update(rekeningen.get(index));
        }
    }
    public int getSize() {
        return rekeningen.size();
    }

}
