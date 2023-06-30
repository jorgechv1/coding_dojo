package puzzleJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Object;
import java.util.Collections;

public class PuzzleJavaTest {

	public static void main(String[] args) {
		PuzzleJava test = new PuzzleJava();
	
		/*1*/
		int [] arreglo1 = {3,5,1,2,7,9,8,13,25,32};
		test.sumaArray(arreglo1);
		test.mayor10(arreglo1);
		
		/*2*/
		ArrayList<String> nombres = new ArrayList<String>();
		Collections.addAll(nombres, "Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa");
		test.mezclar(nombres);
		System.out.println(test.mayor5(nombres));
		
		/*3*/
		ArrayList<String> alfabeto = new ArrayList<String>();
		Collections.addAll(alfabeto, "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
		test.mezclarAlfabeto(alfabeto);
		
		/*4*/
		System.out.println(Arrays.toString(test.randomArray()));
		
		/*5*/
		System.out.println(Arrays.toString(test.randomArraySort()));
		
		/*6*/
		System.out.println(test.randomString());
		
		/*7*/
		System.out.println(Arrays.toString(test.randomStringArray()));
	}

}
