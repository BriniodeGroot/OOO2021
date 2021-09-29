package srcVechterspel.domain;
import java.util.ArrayList;

public class Spel {
	ArrayList<Actor> actoren;

	public Spel(){
		actoren = new ArrayList<Actor>();
	}

	public ArrayList<Actor> getActoren() {
		return actoren;
	}

	public void voegActortoe(Actor actor) throws DomainException{
		if (actor == null){
			throw new DomainException("Actor mag niet null zijn");
		}
		if (actoren.contains(actor)){
			throw new DomainException("Actor bestaat al");
		}
		actoren.add(actor);
		actor.setSpel(this);
	}

	public void valAan(Vechter aanvaller, Actor tegenstander) throws DomainException{
		if (!actoren.contains(aanvaller) || !actoren.contains(tegenstander)){
			throw new DomainException("aanvaller en/of tegenstander niet in spel");
		}
		aanvaller.valAan(tegenstander);
	}

	public int telAantalLevendeVechters(){
		int res = 0;
		for (Actor actor: this.actoren)
			if (actor instanceof Vechter){
				Vechter vechter = (Vechter) actor;
				if (!vechter.isDood()) res++;
			}
		return res;
	}

	public int getLaagsteEnergieNiveau(){
		int laagsteEnergieNiveau = Integer.MAX_VALUE;
		for (Actor actor:actoren){
			if (!actor.isDood() && actor.getEnergieNiveau() < laagsteEnergieNiveau){
				laagsteEnergieNiveau = actor.getEnergieNiveau();
			}
		}
		return laagsteEnergieNiveau;
	}

	public int reincarneerDodeActoren(){
		int aantal = 0;
		for (Actor actor: this.actoren){
			if (actor instanceof Reincarneerbaar){
				((Reincarneerbaar)actor).reincarneer();
				aantal++;
			}
		}
		return aantal;
	}

	public Actor getRandomActor(){
		Actor actor = null;
		if (actoren.size() >0){
			int index = (int)(Math.random()*actoren.size());
			actor = actoren.get(index);
		}
		return actor;
	}

	public Vechter getRandomVechter(){
		Vechter vechter = null;
		if (telAantalLevendeVechters() > 0){
			int index = (int)(Math.random()*actoren.size());
			Actor actor = actoren.get(index);
			while (!(actor instanceof Vechter)){
				index = (int)(Math.random()*actoren.size());
				 actor = actoren.get(index);
			}
			vechter = (Vechter)actor;
		}
		return vechter;
	}

	@Override
	public String toString(){
		String output ="";
		for (Actor actor:actoren){
			output+=actor.toString()+"\n";
		}
		return output;
	}
}
