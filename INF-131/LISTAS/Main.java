
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaSimple l = new ListaSimple();
		System.out.println("tamaño " + l.length());
		
		l.adicionar();
		l.adicionar();
		l.adicionar();
		System.out.println("tamaño " + l.length());
		l.mostrar();
	}

}
