import java.util.Scanner;

public class Mueble {
	protected
		String material;
		double peso;
		String color;

	public
	
	String obt_material(){
		return material;
	}


	double obt_peso(){
		return peso;
	}

	String obt_color(){
		return color;
	}
	
	Mueble(String _m, double p, String c){
		material = _m;
		peso = p;
		color = c;
	}
	
	
	public void leer(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("material + peso + color");
		material = in.next();
		peso = in.nextDouble();
		color = in.next();
	}


	public void mostrar(){
		System.out.println("material: " + material);
		System.out.println("peso: " + peso);
		System.out.println("color: " + color);
	}
}
