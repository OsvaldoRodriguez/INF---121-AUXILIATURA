
public class Pila {
	private int max = 100;
	private int A[] = new  int [max + 1];
	private int tope; 
	
	// adicionar
	// eliminar
	// recorrer
	// tamaño
	
	
	// vacia
		
	Pila() {
		tope = 0;
	}
	
	boolean es_vacia() { // true
		return tope == 0;
	}
	
	int length() {
		return tope;
	}
	
	boolean es_llena() {
		return tope == max;
	}
	
	void adicionar( int x ) {
		if(! es_llena()) {
			A[++tope] = x;
		}else
			System.out.println("pila llena");
	}
	
	
	
	int eliminar() {
		int valor = -1;
		if(!es_vacia()) {
			valor = A[tope--];
		}else
			System.out.println("pila vacia");
		
		return valor;
	}
	
	
	
	
	void mostrar() {
		while(! es_vacia()) {
			int x = eliminar();
			System.out.println(x);
		}
	}
}
