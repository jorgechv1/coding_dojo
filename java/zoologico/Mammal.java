package zoologico;

public class Mammal {
	private int energyLevel;
	
	//mostrar energia
	public void displayEnergy() {
		System.out.println("El nivel de energia es " + this.energyLevel);
	}

	//getters and setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
