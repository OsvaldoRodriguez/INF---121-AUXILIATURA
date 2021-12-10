
public class Cola {
	private int max = 100;
	private int A[] = new int[max + 1];
	private int ini, fin;
	
	// Cola simple
	public Cola() {
		ini = fin = 0;
		
	}
	
	boolean es_vacia() {
		return ini == fin;
	}
	
	boolean es_llena() {
		return fin == max;
	}
	
	int length() {
		return fin;
	}
	
	void adicionar(int dato) {
		if(! es_llena()) {
			fin++;
			A[fin] = dato;
		}
	}
	
	int eliminar() {
		int dato = -1;
		if(! es_vacia()) {
			ini++;
			dato = A[ini]; 
		}
		
		return dato;
	}
	
}
