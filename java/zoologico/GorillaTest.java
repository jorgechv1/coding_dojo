package zoologico;

public class GorillaTest {

	public static void main(String[] args) {

		//instanciar al gorila
		Gorilla gorila = new Gorilla();
		
		//displayEnergy
		gorila.displayEnergy();
		
		//tira algo 3 veces
		gorila.throwSomething();
		gorila.throwSomething();
		gorila.throwSomething();
		
		//comer banana 2 veces
		gorila.eatBananas();
		gorila.eatBananas();
		
		//trepar a el arbol 1 vez
		gorila.climb();
		
		//displayEnergy
		gorila.displayEnergy();
		
		

	}

}
