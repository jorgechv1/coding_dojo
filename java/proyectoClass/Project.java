package proyectoClass;

public class Project {
	private String nombre;
	private String descripcion;
	private double initialCost;
	 
	//constructor vacio
	public Project(){
	}
	
	//constructor con nombre
	public Project(String nombre) {
		this.nombre = nombre;
	}
	
	//constructor con nombre y descripcion
	public Project(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	//contructor con nombre, descripcion y coste
	public Project(String nombre, String descripcion, double coste) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.initialCost = coste;
	}
		
		
	public  void elevatorPitch() {
		System.out.println(this.nombre + " : " + this.descripcion);
	}
	
	public void showPortfolio() {
		System.out.println(this.nombre + " : " + this.descripcion + " : " + this.initialCost);
	}
	
	
	

	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getInitialCost() {
		return initialCost;
	}

	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}
	

}
