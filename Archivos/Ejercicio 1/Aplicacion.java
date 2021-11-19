import java.util.Scanner;

public class Aplicacion {
	private int cod_apl;
	private String nombre;
	private double tamanio;
	private String categoria; 
	// juego, multimedia, edicion, ajustes

	Aplicacion(){
		cod_apl = 0;
		nombre = "";
		tamanio = 0;
		categoria = "";
	}

	
	
	

	public int getCod_apl() {
		return cod_apl;
	}





	public void setCod_apl(int cod_apl) {
		this.cod_apl = cod_apl;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public double getTamanio() {
		return tamanio;
	}





	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}





	public String getCategoria() {
		return categoria;
	}





	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}





	Aplicacion(int codigo, String nombre, double tamanio, String categoria){
		this.cod_apl = codigo;
		this.nombre  = nombre;
		this.tamanio = tamanio;
		this.categoria = categoria;
	}

	// gets y sets


	public void leer(){
		Scanner in = new Scanner(System.in);
		System.out.println("codigo, nombre, tamanio, categoria");
		cod_apl = in.nextInt();
		nombre = in.next();
		tamanio = in.nextDouble();
		categoria = in.next();
	}


	public void mostrar(){
		System.out.println("===================================");
		System.out.println("COD: " + cod_apl);
		System.out.println("NOMBRE: " + nombre);
		System.out.println("TAMAÑO: " + tamanio);
		System.out.println("CATEGORIA: " + categoria);
		System.out.println("===================================");
	}

}
