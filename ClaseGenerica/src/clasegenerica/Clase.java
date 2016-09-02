package clasegenerica;

public class Clase<K,T,V,E> {
	
	private K objetoK;
	private T objetoT;
	private V objetoV;
	private E objetoE;



	public Clase(K objetoK, T objetoT, V objetoV, E objetoE) {
		super();
		this.objetoK = objetoK;
		this.objetoT = objetoT;
		this.objetoV = objetoV;
		this.objetoE = objetoE;
	}



	public void mostarTipo(){
		
		System.out.println("K es un bojeto= "+objetoK.getClass().getName());
		System.out.println("T es un bojeto= "+objetoT.getClass().getName());
		System.out.println("V es un bojeto= "+objetoV.getClass().getName());
		System.out.println("E es un bojeto= "+objetoE.getClass().getName());
	}
	
}
