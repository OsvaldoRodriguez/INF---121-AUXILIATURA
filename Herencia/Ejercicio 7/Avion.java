import java.util.Scanner;

public class Avion extends VehiculoAereo {
	private double velocidad;

	public Avion(int nro_ruedas, String motor, String tipo_combustible, String modelo, double altitud_maxima,
			double velocidad) {
		super(nro_ruedas, motor, tipo_combustible, modelo, altitud_maxima);
		this.velocidad = velocidad;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	public void leer() {
		Scanner in = new Scanner(System.in);
		super.leer();
		System.out.println("velocidad");
		velocidad = in.nextDouble();
	}
	
	public void mostrar() {
		System.out.println("AVION");
		super.mostrar();
		System.out.println("velocidad: " + velocidad);
	}
	
	
	
	
}
