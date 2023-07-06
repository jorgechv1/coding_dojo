package maestrodeobjeto;

public class Samurai extends Human {
	
	public Samurai(){
		setHealth(100);
		setStrength(3);
		setIntelligence(10);
		setStealth(10);
	}

	public String toString() {
		return "Samurai";
	}
}
