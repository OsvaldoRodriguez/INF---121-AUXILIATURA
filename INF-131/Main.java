
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pila p = new Pila();

		p.adicionar(4);
		p.adicionar(10);
		p.adicionar(0);

		System.out.println( "tamaño: " + p.length());
//		p.mostrar();
		System.out.println("Eliminado: " + p.eliminar());
		System.out.println("Eliminado: " + p.eliminar());
		System.out.println("Eliminado: " + p.eliminar());
		System.out.println("Eliminado: " + p.eliminar());
		System.out.println("tamaño: " + p.length());
	}

}
