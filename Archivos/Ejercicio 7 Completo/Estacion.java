import java.io.Serializable;
import java.util.Scanner;

public class Estacion implements Serializable {
	private int codigo_estacion;
	private String ubicacion;
	private String nombre;
	private int nro_buses;
	private Bus B[] = new Bus[100];
	public Estacion(int codigo_estacion, String ubicacion, String nombre) {
		this.codigo_estacion = codigo_estacion;
		this.ubicacion = ubicacion;
		this.nombre = nombre;
		this.nro_buses = 0;
	}
	
	Estacion(){	
	}

	public int getCodigo_estacion() {
		return codigo_estacion;
	}

	public void setCodigo_estacion(int codigo_estacion) {
		this.codigo_estacion = codigo_estacion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNro_buses() {
		return nro_buses;
	}

	public void setNro_buses(int nro_buses) {
		this.nro_buses = nro_buses;
	}

	public Bus[] getB() {
		return B;
	}

	public void setB(Bus[] b) {
		B = b;
	}
	
	public void setB(Bus bus, int i) {
		B[i] = bus;
	}
	
	
	
	public void leer() {
		System.out.println("ESTACION");
		System.out.println("codigo, ubicacion, nombre, nro buses");
		Scanner in = new  Scanner(System.in);
		codigo_estacion = in.nextInt();
		ubicacion = in.next();
		nombre = in.next();
		nro_buses = in.nextInt();
		
		
		
		
		
		for(int i = 0; i < nro_buses; i++) {
			System.out.println("CREAR BUS");
//			// chofer
//			System.out.println("CHOFER");
//			Persona chofer = new Persona();
//			chofer.leer();
//			
//			System.out.println("digite pasajeros del bus: ");
//			int nro_pas = in.nextInt();
//			
//			Persona pasajero[] = new Persona[100];
//			
//			for(int j = 0; j < nro_pas; j++) {
//				pasajero[j] = new Persona();
//				pasajero[j].leer();
//			}
			
			Bus bus = new Bus();
			bus.leer();
			
			// leer chofer
			System.out.println("CHOFER");
			Persona chofer = new Persona();
			chofer.leer();
			
			bus.addChofer(chofer);
			
			//
			System.out.println("digite pasajeros del bus: ");
			int nro_pas = in.nextInt();
			
			for(int j = 0; j < nro_pas; j++) {
				Persona pasajero = new Persona();
				pasajero.leer();
				bus.addPasajero(pasajero);
			}
			
			B[i] = new Bus();
			B[i] = bus;
		}
	}
	
	public void mostrar() {
		System.out.println("\nESTACION\n");
		System.out.println("CODIGO: " + codigo_estacion);
		System.out.println("UBICACION: " + ubicacion);
		System.out.println("NOMBRE: " + nombre);
		System.out.println("NRO DE BUSES: " + nro_buses);
		for(int i = 0; i < nro_buses; i++) {
			System.out.println("\nBUS " + (i + 1) + "\n");
			B[i].mostrar();
		}
	}
	
	
}
