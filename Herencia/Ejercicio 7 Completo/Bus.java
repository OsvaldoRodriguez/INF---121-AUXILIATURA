import java.util.Scanner;

public class Bus extends VehiculoTerrestre{
	private int nro_pasajeros;

	public Bus(int nro_ruedas, String motor, String tipo_combustible,String placa, String marca,int nro_pasajeros) {
		super(nro_ruedas, motor, tipo_combustible, placa, marca);
		this.nro_pasajeros = nro_pasajeros;
	}

	
	public int getNro_pasajeros() {
		return nro_pasajeros;
	}

	public String obt1_motor() {
		return super.obt_motor();
	}
	public void setNro_pasajeros(int nro_pasajeros) {
		this.nro_pasajeros = nro_pasajeros;
	}
	
	public void mostrar() {
		System.out.println("BUS");
		super.mostrar();
		System.out.println("nro_pasajeros: " + nro_pasajeros);
	}
	
	public void leer() {
		super.leer();
		Scanner in = new Scanner(System.in);
		System.out.println("nro pasajeros");
		nro_pasajeros = in.nextInt();
	}
	
	
}
