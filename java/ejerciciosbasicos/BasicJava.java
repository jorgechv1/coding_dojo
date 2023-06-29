package ejerciciosbasicos;

import java.util.ArrayList;
import java.util.List;

public class BasicJava {

	/* 1 */
	public void print255() {
		for (int i = 1; i <= 255; i++) {
			System.out.println(i);
		}
	}

	/* 2 */
	public void printImpares() {
		for (int i = 1; i <= 255; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

	/* 3 */
	public void printSuma() {
		int suma = 0;
		for (int i = 0; i <= 255; i++) {
			suma = suma + i;
			System.out.println("nuevo numero: " + i);
			System.out.println("nueva suma: " + suma);
		}
	}

	/* 4 */
	// primera forma de recorrer un array
	public void recorrerArray(ArrayList<Integer> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			System.out.println(arreglo.get(i));
		}
	}

	/* 4.2 */
	/*
	 * segunda forma de recorrer array sin la i en un for se declara la variable
	 * numero y se le da cada valor de arreglo asi en cada iteracion lo imprimira
	 */

	public void recorrerArray2(ArrayList<Integer> arreglo) {
		for (Integer numero : arreglo) {
			System.out.println(numero);
		}
	}

	/* 5 */
	public void encontrarMax(ArrayList<Integer> arreglo) {
		int max = 0;
		for (int i = 0; i < arreglo.size(); i++) {
			if (arreglo.get(i) > 0) {
				max = arreglo.get(i);
			}
		}
		System.out.println(max);
	}

	/* 6 */
	public void calcularAvg(ArrayList<Integer> arreglo) {
		int suma = 0;
		for (int i = 0; i < arreglo.size(); i++) {
			suma = suma + arreglo.get(i);
		}
		float avg = (float) suma / arreglo.size();
		System.out.println("el promedio es: " + avg);
		System.out.println("la suma es: " + suma);
	}

	/* 7 */
	public void arregloImpares() {
		ArrayList<Integer> y = new ArrayList<Integer>();
		for (int i = 0; i <= 255; i++) {
			if (i % 2 == 1) {
				y.add(i);
			}
		}
		System.out.println(y);
	}

	/* 8 */
	public void arregloCuadrado(List<Integer> arregloX) {
		for (int i = 0; i < arregloX.size(); i++) {
			int cuadrado = (int) Math.pow(arregloX.get(i), 2);
			arregloX.set(i, cuadrado);
		}
		System.out.println(arregloX);
	}

	/* 9 */
	public void eliminarNegativos(ArrayList<Integer> arreglo2) {
		for (int i = 0; i < arreglo2.size(); i++) {
			if (arreglo2.get(i) < 0) {
				arreglo2.set(i, 0);
			}
		}
		System.out.println(arreglo2);
	}

	/* 10 */
	public int[] minMaxAverage(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		int sum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
			sum += arr[i];
		}

		int avg = sum / arr.length;

		return new int[] { max, min, avg };
	}

	/* 11 */
	public void cambiarValores(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;
	}

}
