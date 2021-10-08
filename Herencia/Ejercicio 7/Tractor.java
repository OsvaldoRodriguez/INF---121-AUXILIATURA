import java.util.Scanner;

public class Tractor extends VehiculoTerrestre{
	private double fuerza_pala;

	public Tractor(int nro_ruedas, String motor, String tipo_combustible,String placa, String marca, double fuerza_pala) {
		super(nro_ruedas, motor, tipo_combustible, placa, marca);
		this.fuerza_pala = fuerza_pala;
	}

	public double getFuerza_pala() {
		return fuerza_pala;
	}

	public void setFuerza_pala(double fuerza_pala) {
		this.fuerza_pala = fuerza_pala;
	}
	
	public String obt_placa() {
		return super.getPlaca();
	}
	
	public String obt1_motor() {
		return super.obt_motor();
	}
	
	
	public void leer() {
		super.leer();
		Scanner in = new Scanner(System.in);
		System.out.println("fuerza_pala");
		fuerza_pala = in.nextDouble();
	}
	
	public void mostrar() {
		System.out.println("TRACTOR");
		super.mostrar();
		System.out.println("fuerza_pala: " + fuerza_pala);
	}
	
	public void mismo_motor_marca(Bus s) {
		if(this.obt1_motor().equals(s.getMotor())) {
			if(this.getMarca().equals(s.getMarca())) {
				System.out.println("si tienen");
			}
		}else {
			System.out.println("no tienen");
		}
	}
}
