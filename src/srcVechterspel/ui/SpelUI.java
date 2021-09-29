package srcVechterspel.ui;

import srcVechterspel.domain.*;

public class SpelUI {
	public static void main(String[] args) {
		Spel spel = new Spel();
		//voeg actoren toe aan spel
		try{spel.voegActortoe(new Elf("elfje"));}
		catch (DomainException e) {System.out.println(e.getMessage());}
		try{spel.voegActortoe(new Elf("twaalfje"));}
		catch (DomainException e) {System.out.println(e.getMessage());}
		try{spel.voegActortoe(new Elf("elfje"));}
		catch (DomainException e) {System.out.println(e.getMessage());}
		try{spel.voegActortoe(new Rover("elfje",200));}
		catch (DomainException e) {System.out.println(e.getMessage());}
		try{spel.voegActortoe(new Rover("Maurice",300));}
		catch (DomainException e) {System.out.println(e.getMessage());}
		try{spel.voegActortoe(new Rover("Lowie",4000));}
		catch (DomainException e) {System.out.println(e.getMessage());}
		try{spel.voegActortoe(new Rover("Twan",500));}
		catch (DomainException e) {System.out.println(e.getMessage());}
		try{spel.voegActortoe(new Rover("Jakke",200,2000));}
		catch (DomainException e) {System.out.println(e.getMessage());}
		try{spel.voegActortoe(new Vampier("Toon",300));}
		catch (DomainException e) {System.out.println(e.getMessage());}
		try{spel.voegActortoe(new Vampier("Uno",300,1500));}
		catch (DomainException e) {System.out.println(e.getMessage());}
		try{spel.voegActortoe(new Vampier("Dos",50));}
		catch (DomainException e) {System.out.println(e.getMessage());}
		System.out.println("Actoren in spel\n"+spel);

		//speel spel

		int aantalAanvallen = 1;
		while (aantalAanvallen <= 10){
			Vechter aanvaller = spel.getRandomVechter();
			if (aanvaller == null) break;
			Actor tegenstander = spel.getRandomActor();
			if (tegenstander == null)break;
			try{
				System.out.println("Aanval "+aantalAanvallen+"\n"+aanvaller+" \nversus\n"+tegenstander);
				spel.valAan(aanvaller,tegenstander);
				aantalAanvallen++;
			}
			catch (DomainException e) {System.out.println(e.getMessage());}
		}
		/*
		try{
			Vechter aanvaller = new Rover("Rik",5000);
			Vechter tegenstander =new Vampier("Julius",200);
			spel.voegActortoe(aanvaller);
			spel.voegActortoe(tegenstander);

			System.out.println(aanvaller+" \nversus\n"+tegenstander);
			spel.valAan(aanvaller,tegenstander);
		}
		catch (DomainException e) {System.out.println(e.getMessage());}
		*/

		System.out.println("Actoren in spel\n"+spel);
		System.out.println("Aantal levende vechters na aanvallen: "+spel.telAantalLevendeVechters());
		spel.reincarneerDodeActoren();
		System.out.println("Aantal levende vechters na reincarnatie: "+spel.telAantalLevendeVechters());
	}
}
