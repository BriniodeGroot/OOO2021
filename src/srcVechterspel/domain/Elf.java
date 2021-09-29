package srcVechterspel.domain;

public class Elf extends Actor implements Reincarneerbaar {
	private int aantalLevens;

	private static int INIT_AANTAL_LEVENS = 3;


	public Elf(String naam)throws DomainException {
		this(naam,INIT_AANTAL_LEVENS);
	}

	public Elf(String naam, int aantalLevens)throws DomainException {
		super(naam);
		this.setAantalLevens(aantalLevens);
	}


	public int getAantalLevens() {
		return aantalLevens;
	}

	private void setAantalLevens(int aantalLevens) {
		if (aantalLevens <= 0){
			aantalLevens = INIT_AANTAL_LEVENS;
		}
		else{
			this.aantalLevens = aantalLevens;
		}
	}

	@Override
	public String toString(){
		return "Elf : " + super.toString() + " aantal levens = " + this.getAantalLevens();
	}

	@Override
	public boolean equals(Object object){
		boolean gelijk = false;
		if (object instanceof Elf){
			gelijk = super.equals(object);
		}
		return gelijk;
	}

	@Override
	public void reincarneer() {
		setEnergieNiveau(getInitEnergieNiveau());
		setAantalLevens(1);
	}

	@Override
	protected void verwerkAanval(Vechter aanvaller) {
		setEnergieNiveau(this.getEnergieNiveau() - aanvaller.getKracht());
		if (this.getEnergieNiveau() == 0 && this.getAantalLevens() >= 1){
			this.setAantalLevens(this.getAantalLevens() - 1);
			setEnergieNiveau(getInitEnergieNiveau());
		}
	}
}
