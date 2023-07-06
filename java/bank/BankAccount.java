package bank;

import java.util.Random;

public class BankAccount {
	
	private String numero_cuenta;
	private double saldo_cuenta_corriente;
	private double saldo_cuenta_ahorros;
	private static int cuentas_creadas;
	private static double dinero_almacenado;
	
	//getters and setters
	public String getNumero_cuenta() {
		this.numero_cuenta = cuentaRandom();
		return numero_cuenta;
	}

	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public double getSaldo_cuenta_corriente() {
		return saldo_cuenta_corriente;
	}

	public void setSaldo_cuenta_corriente(double saldo_cuenta_corriente) {
		this.saldo_cuenta_corriente = saldo_cuenta_corriente;
	}

	public double getSaldo_cuenta_ahorros() {
		return saldo_cuenta_ahorros;
	}

	public void setSaldo_cuenta_ahorros(double saldo_cuenta_ahorros) {
		this.saldo_cuenta_ahorros = saldo_cuenta_ahorros;
	}

	public static int getCuentas_creadas() {
		return cuentas_creadas;
	}

	public static void setCuentas_creadas(int cuentas_creadas) {
		BankAccount.cuentas_creadas = cuentas_creadas;
	}

	public static double getDinero_almacenado() {
		return dinero_almacenado;
	}

	public static void setDinero_almacenado(int dinero_almacenado) {
		BankAccount.dinero_almacenado = dinero_almacenado;
	}

	//metodo para cuentas aleatorias
	private String cuentaRandom() {
		Random r = new Random();
		StringBuilder cuenta = new StringBuilder();
		
		for(int i = 0; i < 10; i++) {
			int numero = r.nextInt(10);
			cuenta.append(numero);
		}
		return cuenta.toString();
	}
	
	//constructor con metodo random
	public BankAccount() {
		this.numero_cuenta = cuentaRandom();
		cuentas_creadas++;
	}

	//metodo para depositar dinero
	public void depositarCuentaCorriente(double dinero) {
		setSaldo_cuenta_corriente(getSaldo_cuenta_corriente() + dinero) ;
	}
	
	public void depositarCuentaAhorros(double dinero) {
		setSaldo_cuenta_ahorros(getSaldo_cuenta_ahorros() + dinero) ;
	}
	
	//retirar dinero
	public void retirarDineroCorriente(double dinero) {
		if(dinero > getSaldo_cuenta_corriente()) {
			System.out.println("No tiene fondos sucifientes");
		}
		else {
			setSaldo_cuenta_corriente(getSaldo_cuenta_corriente() - dinero);
		}
	}
	
	public void retirarDineroAhorros(double dinero) {
		if(dinero > getSaldo_cuenta_ahorros()) {
			System.out.println("No tiene fondos sucifientes");
		}
		else {
			setSaldo_cuenta_ahorros(getSaldo_cuenta_ahorros() - dinero);
		}
	}
	
	public double totalDinero() {
		double dinero_total;
		dinero_total = getSaldo_cuenta_ahorros() + getSaldo_cuenta_corriente();
		return dinero_total;
	}
	
	
}
