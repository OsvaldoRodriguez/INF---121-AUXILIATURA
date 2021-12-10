import java.util.Scanner;

public class ListaSimple {
	private Nodo p; // cabecera
	
	public ListaSimple() {
		// TODO Auto-generated constructor stub
		p = null;
	}

	public Nodo getP() {
		return p;
	}

	public void setP(Nodo p) {
		this.p = p;
	}
	
	boolean es_vacia() {
		return p == null;
	}
	
	
	int length() {
		Nodo q = getP();
		int cont = 0;
		while(q != null) {
			q = q.getSig();
			cont++;
		}
		return cont;
	}
	
	
	void adicionar() {
		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		Nodo nuevo = new Nodo(x);
		if(es_vacia()) { // es vacia
			setP(nuevo);
		}else {
			Nodo q = getP();
			while(q.getSig() != null)
				q = q.getSig();
			
			q.setSig(nuevo);
		}
	}
	
	void mostrar() {
		Nodo q = getP();
		while(q != null) {
			q.mostrar();
			q = q.getSig();
		}
	}
	
	
}
