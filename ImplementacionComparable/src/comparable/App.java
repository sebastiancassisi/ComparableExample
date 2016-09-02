package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona(1, "Sebastian", 31));
		lista.add(new Persona(2, "Juan", 50));
		lista.add(new Persona(3, "Pepe", 22));
		
		Collections.sort(lista);
		

		
		for (Persona persona : lista) {
		System.out.println(persona);	
		}
		

	}

}
