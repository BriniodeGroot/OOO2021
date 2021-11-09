package Labo3;

public interface State {

    void Uitlenen();
    void verwijderen();
    void terugbrengen(boolean beschadigd);
    void herstellen();
}
