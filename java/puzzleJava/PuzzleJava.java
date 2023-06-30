package puzzleJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Object;
import java.util.Random;
import java.util.Collections;
import java.util.List;

public class PuzzleJava {

	/* 1 */
	public void sumaArray(int[] arreglo1) {
		int suma = 0;
		for (int i = 0; i < arreglo1.length; i++) {
			suma = arreglo1[i] + suma;
		}
		System.out.println(suma);
	}

	public void mayor10(int[] arreglo1) {
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for (int i = 0; i < arreglo1.length; i++) {
			if (arreglo1[i] > 10) {
				newArray.add(arreglo1[i]);
			}
		}
		System.out.println(newArray);
	}

	/* 2 */
	public void mezclar(ArrayList<String> nombres) {
		Collections.shuffle(nombres);
		System.out.println(nombres);
	}

	public ArrayList<String> mayor5(ArrayList<String> nombres) {
		ArrayList<String> newArray = new ArrayList<String>();
		for (String name : nombres) {
			if (name.length() > 10) {
				newArray.add(name);
			}
		}
		return newArray;
	}

	/* 3 */
	public void mezclarAlfabeto(ArrayList<String> alfabeto) {
		Collections.shuffle(alfabeto);
		System.out.println(alfabeto);
		if (alfabeto.get(0) == "a" || alfabeto.get(0) == "e" || alfabeto.get(0) == "i" || alfabeto.get(0) == "o"
				|| alfabeto.get(0) == "u") {
			System.out.println(alfabeto.get(0));
		}
		System.out.println(alfabeto.get(25));
	}

	/* 4 */
	public int[] randomArray() {
		int[] arregloRandom = new int[10];
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			arregloRandom[i] = random.nextInt(46) + 55;
		}
		return arregloRandom;
	}

	/* 5 */
	public int[] randomArraySort() {
		int[] arregloRandom = new int[10];
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			arregloRandom[i] = random.nextInt(46) + 55;
		}
		Arrays.sort(arregloRandom);
		System.out.println("el valor maximo es: " + arregloRandom[arregloRandom.length - 1]);
		System.out.println("el valor minimo es: " + arregloRandom[0]);
		return arregloRandom;
	}

	/* 6 */
	public String randomString() {
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			char character = (char) (random.nextInt(26) + 'a');
			sb.append(character);
		}
		return sb.toString();
	}

	/* 7 */
	public String[] randomStringArray() {
		String[] randomStringArray = new String[10];
		for(int i = 0; i < 10; i++) {
			randomStringArray[i] = randomString();
		}
		return randomStringArray;
	}

}
