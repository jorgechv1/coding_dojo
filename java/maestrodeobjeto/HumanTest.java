package maestrodeobjeto;

public class HumanTest {

	public static void main(String[] args) {
		
		Wizard mago = new Wizard();
		Ninja ninja = new Ninja();	
		Samurai samurai = new Samurai();
		
		
		//probar ataque
		mago.attack(ninja);
		
		samurai.attack(mago);
		
		ninja.attack(samurai);
	
	}

}
