import java.util.Scanner;

public class Libreria <T>{
	private String encargado;
	private int nro_libros;
	private Libro LB[] = new Libro[100];
	private int stock[] = new int[100];


	

	Libreria(){
		encargado = "Alan";
		nro_libros = 0;
	}

	Libreria(String encargado){
		this.encargado = encargado;
		nro_libros = 0;
	}

	public void leer(){
		Scanner in = new Scanner(System.in);
		encargado = in.next();
		nro_libros = in.nextInt();
		
	}

	public void mostrar(){
		System.out.println("LIBRERIA");
		System.out.println("encargado:" + encargado);
		System.out.println("Nro Libros: " + nro_libros);
		
		System.out.println("LIBROS DE LA LIBRERIA");
		
		for(int i = 0; i < nro_libros; i++){
			LB[i].mostrar();
		}
		
		System.out.println("STOCK");
		for(int i = 0; i < nro_libros; i++){
			System.out.println(stock[i]);
		}
	}

	// adicionar -> solo un libro
	public void adicionar(Libro x, int _stock){
		stock[nro_libros] += _stock;
		LB[nro_libros++] = x;
		// cambiar el stock
		
	}
	
	public boolean comprar_libro(String tit_libro, int cantidad){
		for(int i = 0; i < nro_libros; i++){
			if(LB[i].obt_titulo().equals(tit_libro)){
				if(stock[i] >= cantidad){
					stock[i] -= cantidad;
					return true;
				}
			}
		}
		return false;
	}
	
	public void libros_bib_lib(Biblioteca<T> B, T comp){
		for(int i = 0; i < nro_libros; i++){
			if(B.verificar_disponibilidad_libro_titulo_x(comp, LB[i].obt_titulo())){
				if(stock[i] > 0){
					LB[i].mostrar();
				}
			}
		}
	}

}
