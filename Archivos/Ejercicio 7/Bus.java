import java.io.Serializable;
import java.util.Scanner;

public class Bus implements Serializable{
	private String placa;
	private Persona chofer;
	private int nro_pasajeros;
	private Persona P[] = new Persona[200];
	
	public Bus(String placa) {
		this.placa = placa;
		this.nro_pasajeros = 0;
	}
	
	Bus(){
		placa = "";
		nro_pasajeros = 0;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Persona getChofer() {
		return chofer;
	}

	public void setChofer(Persona chofer) {
		this.chofer = chofer;
	}

	public int getNro_pasajeros() {
		return nro_pasajeros;
	}

	public void setNro_pasajeros(int nro_pasajeros) {
		this.nro_pasajeros = nro_pasajeros;
	}

	public Persona[] getP() {
		return P;
	}

	public void setP(Persona[] p) {
		P = p;
	}
	
	public void leer(Persona chofer, Persona[] pasajeros, int nro_pas) {
		Scanner in = new  Scanner(System.in);
		System.out.println("placa");
		placa = in.next();
		this.chofer = chofer;
		nro_pasajeros = nro_pas;
		for(int i = 0; i < nro_pasajeros; i++) {
			P[i] = new Persona();
		}
		this.P = pasajeros;
		
	}
	
	
	public void mostrar() {
		System.out.println("\nBUS");
		System.out.println("PLACA: " + placa);
		System.out.println("CHOFER");
		chofer.mostrar();
		System.out.println("NRO PASAJEROS: " + nro_pasajeros);
		for(int i = 0; i < nro_pasajeros; i++) {
			P[i].mostrar();
		}
		System.out.println();
	}
	
	public void addChofer(Persona chofer) {
		this.chofer = chofer;
	}
	
	public void addPasajero(Persona pasajero) {
		if(nro_pasajeros < 100) {
			P[nro_pasajeros] = new Persona();
			P[nro_pasajeros++] = pasajero;		
		}
	}
	
	
	
	
	
	
	
}
