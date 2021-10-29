import java.util.Scanner;

public class Libro {
	private String titulo, autor, tipo;

	

	Libro(){
		titulo = autor = tipo = "";
	}

	public String obt_titulo() {
		return titulo;
	}
	
	Libro(String titulo, String autor, String tipo){
		this.titulo = titulo;
		this.autor = autor;
		this.tipo = tipo;
	}

	public void leer(){
		Scanner in = new Scanner(System.in);
		System.out.println("titulo + autor + tipo");
		titulo = in.next();
		autor = in.next();
		tipo = in.next();
	}


	public void mostrar(){
		System.out.println("LIBRO");
		System.out.println("Titulo: " + titulo);
		System.out.println("autor: " + autor);
		System.out.println("tipo: " + tipo);
		
	}
}
