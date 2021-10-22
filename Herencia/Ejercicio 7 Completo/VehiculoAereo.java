import java.util.Scanner;

public class VehiculoAereo extends Vehiculo{
	protected String modelo;
	protected double altitud_maxima;
	
	public VehiculoAereo(int nro_ruedas, String motor, String tipo_combustible, String modelo, double altitud_maxima) {
		super(nro_ruedas, motor, tipo_combustible);
		this.modelo = modelo;
		this.altitud_maxima = altitud_maxima;
	}
	
	public int obt_nro_ruedas() {
		return super.getNro_ruedas();
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getAltitud_maxima() {
		return altitud_maxima;
	}
	public void setAltitud_maxima(double altitud_maxima) {
		this.altitud_maxima = altitud_maxima;
	}
	
	
	public void leer() {
		Scanner in = new Scanner(System.in);
		super.leer();
		System.out.println("modelo + altitud _ maxima");
		modelo = in.next();
		altitud_maxima = in.nextDouble();
	}
	
	public void mostrar() {
		super.mostrar();
		
		System.out.println("modelo: " + modelo);
		System.out.println("altitud_maxima: " + altitud_maxima);
	}
	
	
	
	
	
	
}
