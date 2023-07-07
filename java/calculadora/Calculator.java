package calculadora;

public class Calculator {
	
	double OperandOne;
	double OperandTwo;
	double result;
	char operation;

	
	public double getOperandOne() {
		return OperandOne;
	}

	public void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}

	public double getOperandTwo() {
		return OperandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}
	
	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}
	

	void performOperation() {
		if(this.operation == '+') {
			System.out.println("El resultado de la suma es: ");
			this.result = getOperandOne() + getOperandTwo();
		}
		else if(this.operation == '-') {
			System.out.println("El resultado de la resta es: ");
			this.result = getOperandOne() - getOperandTwo();
		}
	}
	
	void getResult() {
		System.out.println(this.result);
	}

	

	


}
