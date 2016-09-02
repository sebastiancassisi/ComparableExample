package ejemplosingleton;

public class App {

	public static void main(String[] args) {

		//Sin siglenton
		
/*		PaisDAOInpl dao = new PaisDAOInpl();

		for (Object obj : dao.getPaises()) {
			System.out.println(((Pais) obj).getNombre());
		}

		PaisDAOInpl dao2 = new PaisDAOInpl();

		for (Object obj : dao2.getPaises()) {
			System.out.println(((Pais) obj).getNombre());
		}*/

		//Con siglenton
		
		PaisDAOInpl dao = PaisDAOInpl.getInstance();
		
		for (Object obj : dao.getPaises()) {
			System.out.println(((Pais) obj).getNombre());
		}
		
		
PaisDAOInpl dao2 = PaisDAOInpl.getInstance();
		
		for (Object obj : dao2.getPaises()) {
			System.out.println(((Pais) obj).getNombre());
		}
	}

}
