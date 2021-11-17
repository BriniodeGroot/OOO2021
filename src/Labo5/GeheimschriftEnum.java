package Labo5;

public enum GeheimschriftEnum {

    CAESAR ("Caesar","Labo5.geheimschriften.Caesarcijfer"),
    CAESAR2 ("Caesar","Labo5.geheimschriften.Caesarcijfer2"),
    SPIEGELING ("Spiegeling","Labo5.geheimschriften.Spiegeling");


    private final String omschrijving;
    private final String klasseNaam;

    GeheimschriftEnum(String omschrijving, String klasseNaam){
        this.omschrijving = omschrijving;
        this.klasseNaam = klasseNaam;
    }

    public String getOmschrijving() { return omschrijving; }
    public String getKlasseNaam() { return klasseNaam; }
}
