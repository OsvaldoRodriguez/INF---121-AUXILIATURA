import java.util.Scanner;

public class FiguraGeometrica {
	protected 
		String color;

	public

	String obt_color(){
		return color;
	}

	FiguraGeometrica(String _color){
		color = _color;
	}

	void leer(){
		Scanner in = new Scanner(System.in);
		System.out.println("color");
		color = in.next();
		
	}

	void mostrar(){
		System.out.println("color: " + color);
	}
}
