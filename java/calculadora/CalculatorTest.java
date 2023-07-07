package calculadora;

public class CalculatorTest {

	public static void main(String[] args) {
	
		Calculator prueba = new Calculator();
		
		prueba.setOperandOne(10.5);
		prueba.setOperation('+');
		prueba.setOperandTwo(5.2);
		prueba.performOperation();
		prueba.getResult();

	}

}
