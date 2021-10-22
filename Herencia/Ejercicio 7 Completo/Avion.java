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
	
	public double obt_altitud_maxima() {
		return super.getAltitud_maxima();
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	public String obt_modelo() {
		return super.getModelo();
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
		System.out.println("=====================================");
	}

	public void misma_velocidad(Avion a1) {
		if(velocidad > a1.velocidad) {
			System.out.println(obt_modelo());
		}else if(velocidad < a1.velocidad){
			System.out.println(a1.obt_modelo());
		}else {
			System.out.println(obt_modelo());
			System.out.println(a1.obt_modelo());
		}
		
	}
	
	
	
	
}
