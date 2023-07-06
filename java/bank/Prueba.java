package bank;

public class Prueba {

	public static void main(String[] args) {
		
		BankAccount cuenta1 = new BankAccount();
		BankAccount cuenta2 = new BankAccount();
		BankAccount cuenta3 = new BankAccount();
		System.out.println(cuenta1.getNumero_cuenta());
		
		//depositar ahorros
		cuenta1.depositarCuentaAhorros(1000);
		System.out.println(cuenta1.getSaldo_cuenta_ahorros());
		
		//retirar ahorros
		cuenta1.retirarDineroAhorros(300);
		System.out.println("Saldo cuenta ahorros: " + cuenta1.getSaldo_cuenta_ahorros());
		
		//depositar corriente
		cuenta1.depositarCuentaCorriente(2500);
		System.out.println("Saldo cuenta corriente: " + cuenta1.getSaldo_cuenta_corriente());
		
		//saldo total
		System.out.println("Dinero total almacenado: " + cuenta1.totalDinero());
		
		//retirar dinero insuficiente
		cuenta1.retirarDineroAhorros(800);
		
		//cuenta 2
		cuenta2.depositarCuentaCorriente(3000);
		System.out.println("Saldo cuenta corriente 2: " + cuenta2.getSaldo_cuenta_corriente());
		
		cuenta2.depositarCuentaAhorros(6000);
		System.out.println("Dinero total cuenta 2: " + cuenta2.totalDinero());
		
		//cuentas creadas
		System.out.println(BankAccount.getCuentas_creadas());
		
		
		

	}

}
