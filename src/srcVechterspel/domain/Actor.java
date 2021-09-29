package srcVechterspel.domain;

public abstract class Actor {
private String naam;
private int energieNiveau;
private Spel spel;

private static final int INIT_ENERGIE_NIVEAU = 1000;

public Actor(String naam) throws DomainException{
	this(naam,INIT_ENERGIE_NIVEAU);
}

public Actor(String naam,int energieNiveau) throws DomainException{
	this.setNaam(naam);
	this.setEnergieNiveau(energieNiveau);
}


public String getNaam() {
	return naam;
}

private void setNaam(String naam) throws DomainException {
	if (naam == null || naam.equals(" ")) throw new DomainException("naam niet blanco");
	this.naam = naam;
}

public int getEnergieNiveau() {
	return energieNiveau;
}

protected void setEnergieNiveau(int energieNiveau){
	if (energieNiveau <= 0)  this.energieNiveau= 0;
	else
	this.energieNiveau = energieNiveau;
}

public Spel getSpel(){
	return spel;
}

protected void setSpel(Spel spel) throws DomainException{
	this.spel = spel;
}

public static int getInitEnergieNiveau() {
	return INIT_ENERGIE_NIVEAU;
}

protected abstract void verwerkAanval(Vechter aanvaller);


public boolean isDood(){
	return this.getEnergieNiveau() == 0;
}

@Override
public boolean equals(Object object){
	boolean gelijk= false;
	if (object instanceof Actor){
		gelijk= this.getNaam().equals(((Actor)object).getNaam());
		}
	return gelijk;
}

@Override
public String toString(){
	return this.getNaam()+(isDood()?"(+)":"")+" en energieniveau = " + this.getEnergieNiveau();
}


}
