package ejemplosingleton;

public class Singleton {
	
	private static Singleton instancia = null;
	
	public static Singleton getInstance(){
		
		if(instancia == null){	
			instancia = new Singleton();
		}
		return instancia;
	}

	private Singleton(){
		
	}
	
}
