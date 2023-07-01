package map;

//importar los hashmap
import java.util.HashMap;
//importar metodos Set 
import java.util.Set;

public class mapaHashmatique {

	public static void main(String[] args) {
		
		// Llamar a la clase hashMap String1 es la clave y String2 es lo que contiene 
		HashMap<String, String> userMap = new HashMap<String, String>();
		
		//userMap.put("clave","valor"); introducir clave y valor dentro del hashMap
		userMap.put("Midnight Whispers", "In the darkness of the night, our whispers intertwine, a secret melody only we can find.");
		userMap.put("Starlit Dreams", "Underneath the moonlit sky, we dance with dreams that never die, our hearts soar as stars collide.");
		userMap.put("Eternal Embrace", "In your arms, I find my solace, a love that transcends time and space, our souls entwined in eternal embrace.");
		userMap.put("Fading Memories", "Like shadows in the fading light, memories slip through my fingers tight, a bittersweet echo of what once was.");
		userMap.put("Uncharted Horizon", "We set sail on uncharted seas, chasing dreams and embracing the unknown, the horizon beckons, our story unfolds.");

		//se declara la variable name para obtener datos del hashMap en este caso el primer valor
		String name = userMap.get("Midnight Whispers");
		
		//imprimo la variable name que contiene el primer valor del hashmap
		System.out.println(name);
		
		//tambien puedo imprimirla llamando directamente la clave con userMap.get(key);
		System.out.println(userMap.get("Starlit Dreams")); 
		
		//recorrer un hashmap
		Set<String> trackList = userMap.keySet();
		
		//bucle for para recorrer el hashMap
		for(String cancion : trackList) {
			System.out.println(cancion);
			System.out.println(userMap.get(cancion));
		}
		

	}

}
