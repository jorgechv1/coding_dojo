package maestrodeobjeto;

public class Wizard extends Human {

	public Wizard(){
		setHealth(100);
		setStrength(3);
		setIntelligence(10);
		setStealth(5);
	}
	
	public String toString() {
		return "Wizard";
	}
}
