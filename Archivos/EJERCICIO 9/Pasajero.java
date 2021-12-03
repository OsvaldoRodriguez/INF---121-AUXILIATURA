import java.util.Scanner;
import java.io.*;
public class Pasajero implements java.io.Serializable{
	private String codigo;
	private String nombre_pasajero;
	private int ci;
	
	public Pasajero() {
		
	}
	public Pasajero(String codigo, String nombre_pasajero, int ci) {
		this.codigo = codigo;
		this.nombre_pasajero = nombre_pasajero;
		this.ci = ci;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre_pasajero() {
		return nombre_pasajero;
	}
	public void setNombre_pasajero(String nombre_pasajero) {
		this.nombre_pasajero = nombre_pasajero;
	}
	public int getCi() {
		return ci;
	}
	
	public void setCi(int ci) {
		this.ci = ci;
	}
	
	public void leer() {
		Scanner in = new Scanner(System.in);
		System.out.println("codigo - nombre - ci");
		codigo = in.next();
		nombre_pasajero = in.next();
		ci = in.nextInt();
	}
	
	public void mostrar() {
		System.out.println("PASAJERO");
		System.out.println("===========================");
		System.out.println("CODIGO: " + codigo);
		System.out.println("NOMBRE: " + nombre_pasajero);
		System.out.println("CI: " + ci);
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
}
