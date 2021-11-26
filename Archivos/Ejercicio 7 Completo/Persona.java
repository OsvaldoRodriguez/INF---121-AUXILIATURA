import java.io.Serializable;
import java.util.Scanner;

public class Persona implements Serializable{
	private int ci;
	private String nombre;
	private String fecha_nac;
	// dd/mm/aaaa
	// 0123456789
	
	Persona(){
		ci = 0;
		nombre = fecha_nac = "";
	}
	
	public Persona(int ci, String nombre, String fecha_nac) {
		this.ci = ci;
		this.nombre = nombre;
		this.fecha_nac = fecha_nac;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	public void leer() {
		Scanner in = new Scanner(System.in);
		System.out.println("ci - nombre - fechanac");
		ci = in.nextInt();
		nombre = in.next();
		fecha_nac = in.next();
		
	}
	
	public void mostrar() {
		System.out.println("\nPERSONA");
		System.out.println("CI: " + ci );
		System.out.println("NOMBRE: " + nombre);
		System.out.println("FECHA  NAC : " + fecha_nac );
		System.out.println();
	}
	
	public int edad() {
		String anio = fecha_nac.substring(6, 10);
		
		int year = Integer.parseInt(anio);
		return 2021 - year;
	}
	
	
	
}
