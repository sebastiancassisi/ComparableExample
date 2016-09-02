package ejemplosingleton;

import java.util.ArrayList;
import java.util.List;



public class PaisDAOInpl {

	public static PaisDAOInpl instancia =null;
	private List paises;
	
	
	private PaisDAOInpl(){
		//Usar constructor privado para singleton
	}
	
	public static PaisDAOInpl getInstance(){
		
		if(instancia == null){
			instancia = new PaisDAOInpl();
		}
		return instancia;
	}
	

	public List getPaises() {

		if (paises == null) {

			paises = new ArrayList();

			Pais p1 = new Pais("Argentina");
			Pais p2 = new Pais("Venezuela");
			Pais p3 = new Pais("Colombia");

			paises.add(p1);
			paises.add(p2);
			paises.add(p3);
		}

		return paises;
	}

}
