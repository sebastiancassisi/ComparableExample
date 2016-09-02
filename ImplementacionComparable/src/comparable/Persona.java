package comparable;

public class Persona implements Comparable<Persona>{
	
	private int id;
	private String nombre;
	private int edad;
	
	
	
	
	public Persona() {
		super();
	}


	public Persona(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}


	@Override
	// Compara por edad
	/*public int compareTo(Persona o) {
		return this.edad - o.getEdad();
	}*/

	// Compara por Nombre
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.getNombre());
	}
	
	
	

}
