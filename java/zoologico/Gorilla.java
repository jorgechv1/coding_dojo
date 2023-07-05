package zoologico;

public class Gorilla extends Mammal{

	public Gorilla() {
		setEnergyLevel(100);
	}

	//tirar cosas a las personas
	public void throwSomething(){
		System.out.println("El gorila ha lanzado algo");
		setEnergyLevel(getEnergyLevel() - 5);
	}
	
	//comer bananas
	public void eatBananas() {
		System.out.println("El gorila se siente satisfecho");
		setEnergyLevel(getEnergyLevel() + 10);
	}
	
	//trepar a la cima
	public void climb() {
		System.out.println("El gorila ha llegado a la cima!");
		setEnergyLevel(getEnergyLevel() - 10);
	}
}
