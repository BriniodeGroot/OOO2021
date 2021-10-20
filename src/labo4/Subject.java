package labo4;

public interface Subject {

    public void addobserver(Observer o);
    public void removeobserver(Observer o);
    public void notifyobservers();
}
