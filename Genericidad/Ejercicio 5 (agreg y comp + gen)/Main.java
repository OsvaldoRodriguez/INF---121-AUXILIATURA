
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a) Crear todas las clases, una librería y una biblioteca.
		
		
		Libro l1 = new Libro("POO para noobs", "Chungara", "1");
		Libro l2 = new Libro("Calculo II", "Chungara", "1");
		Libro l3 = new Libro("Calculo III", "Chungara", "1");
		Libro l4 = new Libro("Programacion Competitiva", "Halim", "1");
		
		Libreria<String> lib = new Libreria<String>();
		
		lib.adicionar(l1, 5);
		lib.adicionar(l2, 5);
		lib.adicionar(l3, 10);
		lib.adicionar(l4, 1);
		
		lib.mostrar();
		
		// 1 esta disponible
		// 0 no esta disponible
		
		Biblioteca<String> bib = new Biblioteca<String>("INFORMATICA");
		//  esta disponible
		//  no esta disponible
		
		
		

		bib.adicionar("Disponible", l1);
		bib.adicionar("Disponible", l2);
		bib.adicionar("Disponible", l4);
		bib.mostrar();
		
		
		
		
		//b) Realizar un método que verifique si el libro con título x está disponible en la biblioteca.

		System.out.println("==========================================");
		System.out.println("inciso B\n");
		
		if (bib.verificar_disponibilidad_libro_titulo_x("Disponible", "Programacion Competitiva")) {
			System.out.println("si esta disponible");
		}else{
			System.out.println("no esta disponible");
		}
		
		
		
		// c) Realizar un método que realice la compra de N libros con el título “POO para noobs” en la librería.

		System.out.println("==========================================");
		System.out.println("inciso C\n");
		
		
		if(lib.comprar_libro("POO para noobs", 5)) {
			System.out.println("Libros comprados");
		}else{
			System.out.println("no se puede hacer la compra");
		}
		
		if(lib.comprar_libro("POO para noobs", 5)) {
			System.out.println("Libros comprados");
		}else{
			System.out.println("no se puede hacer la compra");
		}
		
		lib.mostrar();
		
//		d) Mostrar los libros que se encuentren tanto en la librería como en la biblioteca.

		System.out.println("==========================================");
		System.out.println("inciso D\n");
		
		lib.libros_bib_lib(bib, "Disponible");
		
		
		// e) eliminar el libro con titulo x de la biblioteca
		
		System.out.println("==========================================");
		System.out.println("inciso E\n");
		
		bib.eliminar("Disponible", "POO para noobs");
		
		bib.mostrar();
		
	}

}
