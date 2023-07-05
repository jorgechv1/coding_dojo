package zoologico;

public class Bat extends Mammal {

	public Bat() {
		setEnergyLevel(300);
	}

	public void fly() {
		System.out.println("El murcielago esta volando");
		setEnergyLevel(getEnergyLevel() - 50); 
	}
	
	public void eatHumans() {
		System.out.println("Se ha comido a un humano!, Bueno, no importa");
		setEnergyLevel(getEnergyLevel() + 25); 
	}
	
	public void attackTown() {
		System.out.println("La ciudad esta en llamas!");
		setEnergyLevel(getEnergyLevel() - 100); 
	}
}
