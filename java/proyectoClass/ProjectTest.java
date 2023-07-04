package proyectoClass;

public class ProjectTest {

	public static void main(String[] args) {
		Project proyecto1 = new Project();
		
		//crear proyecto de prueba
		proyecto1.setNombre("Prueba");
		proyecto1.setDescripcion("Descripcion prueba");
		proyecto1.setInitialCost(3000);
		
		//crear segundo proyecto de prueba
		Project proyecto2 = new Project("Proyecto dos");
		proyecto2.setDescripcion("Descripcion de prueba dos");
		proyecto2.setInitialCost(2500);
		
		Project proyecto3 = new Project("Proyecto tres","Descripcion de prueba tres",5400);
		
		//pruebas elevatorPitch
		proyecto1.elevatorPitch();
		proyecto2.elevatorPitch();
		proyecto3.elevatorPitch();
		
		
		//pruebas showPortfolio
		proyecto1.showPortfolio();
		proyecto2.showPortfolio();
		proyecto3.showPortfolio();
	}

}
