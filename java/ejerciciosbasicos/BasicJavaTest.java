package ejerciciosbasicos;

import java.util.ArrayList;

public class BasicJavaTest {

	public static void main(String[] args) {
		
		BasicJava x = new BasicJava(); // llamar los metodos de la clase basic java
		
		/*1*/
		x.print255();
		/*2*/
		x.printImpares();
		/*3*/
		x.printSuma();
		/*4*/
		ArrayList<Integer> arreglo = new ArrayList<Integer>();
		arreglo.add(1);
		arreglo.add(3);
		arreglo.add(5);
		arreglo.add(7);
		arreglo.add(9);
		arreglo.add(13);
		x.recorrerArray(arreglo);
		x.recorrerArray2(arreglo);
		/*5*/
		x.encontrarMax(arreglo);
		/*6*/
		x.calcularAvg(arreglo);
		/*7*/
		x.arregloImpares();
		/*8*/
		ArrayList<Integer> arregloX = new ArrayList<>();
		arregloX.add(1);
		arregloX.add(5);
		arregloX.add(10);
		arregloX.add(-2);
		x.arregloCuadrado(arregloX);
		/*9*/
		ArrayList<Integer> arreglo2 = new ArrayList<>();
		arreglo2.add(1);
		arreglo2.add(5);
		arreglo2.add(10);
		arreglo2.add(-2);
		x.eliminarNegativos(arreglo2);
		/*10*/
		int[] arr3 = {1,5,10,-2};
		System.out.println(x.minMaxAverage(arr3));
		
		
		
		
		
		
		
		
		
		
		//ArrayList<Integer> numeros = new ArrayList<Integer>();
		//numeros.add(1);
		//numeros.add(5);
		//numeros.add(10);
		//numeros.add(-2);
		//EjerciciosBasicos x = new EjerciciosBasicos();

	}


}
