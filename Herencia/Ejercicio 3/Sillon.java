import java.util.Scanner;

public class Sillon extends Mueble {
	private 
		int capacidad;


	public
	
	int obt_capacidad() {
		return capacidad;
	}

	Sillon(String _mat, double _peso, String _color, int _cap){
		super(_mat, _peso, _color);
		capacidad = _cap;
	}

	public void leer(){
		super.leer();
		Scanner in = new Scanner(System.in);
		System.out.println("capacidad");
		capacidad = in.nextInt();
	}


	public void mostrar(){
		System.out.println("SILLON");
		super.mostrar();
		System.out.println("capacidad: " + capacidad);
	}
}
