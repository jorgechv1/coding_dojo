package maestrodeobjeto;

public class Ninja extends Human {

	public Ninja(){
		setHealth(100);
		setStrength(3);
		setIntelligence(5);
		setStealth(10);
	}
	
	public String toString() {
		return "Ninja";
	}
}
