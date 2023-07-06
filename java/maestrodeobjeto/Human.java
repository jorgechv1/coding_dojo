package maestrodeobjeto;

public class Human {
	
	private int health;
	private int strength;
	private int intelligence;
	private int stealth;
	
	//get and set
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}


	//method attack
	public void attack(Human victima) {
		System.out.println("El " + victima + " esta siendo atacado!");
		System.out.println("Daño total recibido: " + getStrength());
		victima.setHealth( victima.getHealth() - getStrength());
		System.out.println("Vida restante: " + victima.getHealth());
	}

}
