import java.util.Scanner;

public class Helicoptero extends VehiculoAereo {
	private int nro_helices;

	public Helicoptero(int nro_ruedas, String motor, String tipo_combustible, String modelo, double altitud_maxima,
			int nro_helices) {
		super(nro_ruedas, motor, tipo_combustible, modelo, altitud_maxima);
		this.nro_helices = nro_helices;
	}

	public int getNro_helices() {
		return nro_helices;
	}

	public void setNro_helices(int nro_helices) {
		this.nro_helices = nro_helices;
	}
	
	public double obt_altitud_maxima() {
		return super.getAltitud_maxima();
	}
	public void leer() {
		Scanner in = new Scanner(System.in);
		super.leer();
		System.out.println("helices");
		nro_helices = in.nextInt();
	}
	
	public void mostrar() {
		System.out.println("HELICOPTERO");
		super.mostrar();
		System.out.println("nro_helices: " + nro_helices);
	}

	public void misma_velocidad_altitud(Helicoptero h1) {
		// TODO Auto-generated method stub
		String ans = "NO";
		if(getNro_helices() == h1.getNro_helices()) {
			if(obt_altitud_maxima() == h1.obt_altitud_maxima()) {
				ans = "SI";
			}
		}
		System.out.println(ans);
	}
	
}
