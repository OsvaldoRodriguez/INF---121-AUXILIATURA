import java.util.Scanner;

public class Circulo extends FiguraGeometrica{
	private double radio;

	public 

		double obt_radio(){
			return radio;
		}

		Circulo(String color, double _radio){
			super(color);
			radio = _radio;
		}

		void leer(){
			System.out.println("radio");
			Scanner in = new Scanner(System.in);		
			super.leer();
			radio = in.nextDouble();
		}

		void mostrar(){
			System.out.println("CIRCULO");
			super.mostrar();
			System.out.println("radio: " + radio);
		}
		
		void mayor_area(Circulo c){

			if(this.area() > c.area())  {
				this.mostrar();
			}else if(this.area() < c.area()) {
				c.mostrar();
			}else{
				this.mostrar();
				c.mostrar();
			}
		}

		void mayor_area(Triangulo t){
			double a1 = this.area();  // area del circulo
			double a2 = t.area();

			if(a1 > a2)  {
				this.mostrar();
			}else if(a1 < a2)  {
				t.mostrar();
			}else{
				this.mostrar();
				t.mostrar();
			}
		}
		
		void colores_iguales(Triangulo t){
			if(this.color.equals(t.obt_color()))  {
				System.out.println("son iguales");
			}else{
				System.out.println("no son iguales");
			}
		}

		double area(){
			return radio * radio * Math.PI;
		}
}
