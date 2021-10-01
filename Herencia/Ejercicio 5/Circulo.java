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


		double area(){
			return radio * radio * Math.PI;
		}
}
