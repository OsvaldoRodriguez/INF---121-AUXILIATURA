import java.util.Scanner;

public class Triangulo extends FiguraGeometrica {
	private double lado_1;
	private double lado_2;
	private double lado_3;

	public

	Triangulo(String _color, double l1, double l2, double l3){
		super(_color);
		lado_1 = l1;
		lado_2 = l2;
		lado_3 = l3;
	}

	double obt_lado_1(){
		return lado_1;
	}

	double obt_lado_2(){
		return lado_2;
	}

	double obt_lado_3(){
		return lado_3;
	}

	void leer(){
		super.leer();
		Scanner in = new Scanner(System.in);
		System.out.println("lados del triangulo");
		lado_1 = in.nextDouble();
		lado_2 = in.nextDouble();
		lado_3 = in.nextDouble();
	}


	void mostrar(){
		System.out.println("TRIANGULO");
		super.mostrar();
		System.out.println("lados: " +  lado_1 + ", " +  lado_2 + ", " +  lado_3 );
	}
	
	
	double area() {
		double s = (lado_1 + lado_2 + lado_3) / 2;
		double area = Math.sqrt(s * (s - lado_1) * (s - lado_2) * (s - lado_3));
		return area;
	}
	
	void isoceles(){
		if(lado_1 == lado_2 || lado_1 == lado_3 || lado_2 == lado_3) {
			System.out.println("es isoceles");
		}else{
			System.out.println("no es isoceles");
		}
	}
	
	void rectangulo() {
		double c = 0, a = 0, b = 0;
		if(lado_1 > c) {
			c = lado_1;
			a = lado_2;
			b = lado_3;
		}
		
		if(lado_2 > c) {
			c = lado_2;
			a = lado_3;
			b = lado_1;
		}
		
		if(lado_3 > c) {
			c = lado_3;
			a = lado_2;
			b = lado_1;
		}
		
		if(c * c == a * a + b * b) {
			System.out.println("es rectangulo");
		}else {
			System.out.println("no es rectangulo");
		}
		
		
	}
	
	
	
	
	public void mayor_area(Circulo c){
		double a1 = this.area(); 
		double a2 = c.area();

		if(a1 > a2)  {
			this.mostrar();
		}else if(a1 < a2) {
			c.mostrar();
		}else{
			this.mostrar();
			c.mostrar();
		}
	}
}
