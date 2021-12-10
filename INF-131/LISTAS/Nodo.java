
public class Nodo {

	private Nodo sig;
	// informacion
	int numero;
	
	Nodo(){
		sig = null;
	}
	
	Nodo(int x){
		sig = null;
		numero = x;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}
	
	void mostrar() {
		System.out.println(numero + ",");
	}
	
	
}
