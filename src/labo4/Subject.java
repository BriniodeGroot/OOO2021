package labo4;

public interface Subject {

    void addobserver(Observer o);
    void removeobserver(Observer o);
    void notifyobservers(int index);
}
