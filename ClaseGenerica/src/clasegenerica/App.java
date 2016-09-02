package clasegenerica;

public class App {

	public static void main(String[] args) {
		
		Clase<String,Boolean,Integer,Double> c = new Clase<>("Sebastian",true,14,10.0);
		c.mostarTipo();
	}

}
