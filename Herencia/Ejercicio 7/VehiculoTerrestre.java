import java.util.Scanner;

public class VehiculoTerrestre extends Vehiculo {
	protected String placa;
	protected String marca;
	
	public VehiculoTerrestre(int nro_ruedas, String motor, String tipo_combustible,String placa, String marca) {
		super(nro_ruedas, motor, tipo_combustible);
		this.placa = placa;
		this.marca = marca;
	}

	public String obt_motor() {
		return super.getMotor();
	}
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("placa: " + placa);
		System.out.println("marca: " + marca);
	}
	
	public void leer() {
		Scanner in = new Scanner(System.in);
		super.leer();
		System.out.println("placa + marca");
		placa = in.next();
		marca = in.next();
	}
	
	
	
	
	
	
	
	
	
}
