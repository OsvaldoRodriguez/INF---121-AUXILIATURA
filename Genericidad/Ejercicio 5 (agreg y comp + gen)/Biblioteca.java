import java.util.Scanner;

public class Biblioteca <T>{
	private String nombre;
	private int nroLib;
	private Libro LB[] = new Libro[100];
	private Object disponibilidad[] = new Object[100];


	public

	Biblioteca(){
		nombre = "";
		nroLib = 0;
	}

	Biblioteca(String nombre){
		this.nombre = nombre;
		nroLib = 0;
	}


	public void mostrar(){
		System.out.println("BIBLIOTECA");
		System.out.println("nombre:" + nombre);
		System.out.println("Nro Libros: " + nroLib);
		System.out.println("LIBROS DE LA BIBLIOTECA");
		for(int i = 0;i < nroLib; i++){
			LB[i].mostrar();
		}
		
		System.out.println("DISPONIBILIDAD");
		for(int i = 0;i < nroLib; i++){
			System.out.println(disponibilidad[i]);
		}
	}
	
	public boolean verificar_disponibilidad_libro_titulo_x(T comparar, String tit){
		for(int i = 0; i < nroLib; i++){
			if(LB[i].obt_titulo().equals(tit)){
				if(disponibilidad[i].equals(comparar)){
					return true;
				}
			}
		}

		return false;
	}
	
	public void adicionar(T valor, Libro x){
		disponibilidad[nroLib] = valor;
		LB[nroLib++] = x;
	}
	
	public boolean eliminar(T comp, String tit) {
		if(verificar_disponibilidad_libro_titulo_x(comp, tit)) {
			
			for(int i = 0; i < nroLib; i++) {
				if(LB[i].obt_titulo().equals(tit)) {
					for(int j = i + 1; j < nroLib; j++) {
						LB[j - 1] = LB[j];
						disponibilidad[j - 1] = disponibilidad[j];
					}
					nroLib--;
					
				}
			}
			
			
			
			
			return true;
		}
		
		return false;
	}

}
