package zoologico;

public class BatTest {
	
	public static void main(String[] args) {
	Bat mur = new Bat();
	
	mur.displayEnergy();
	//atacar la ciudad 3 veces
	mur.attackTown();
	mur.attackTown();
	mur.attackTown();
	//comer 2 humanos
	mur.eatHumans();
	mur.eatHumans();
	//volar dos veces
	mur.fly();
	mur.fly();
	mur.displayEnergy();
	
	
}
}