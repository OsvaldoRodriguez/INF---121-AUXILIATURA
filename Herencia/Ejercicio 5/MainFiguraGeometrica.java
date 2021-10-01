
public class MainFiguraGeometrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a) Instanciar 3 triangulos y 3 circulos, leer y mostrar datos

		Triangulo t1 = new Triangulo("Verde", 3, 4, 5);
		Triangulo t2 = new Triangulo("Rojo", 30, 41, 35);
		Triangulo t3 = new Triangulo("Verde", 14, 8, 14);

		Circulo c1 = new Circulo("Azul", 2);
		Circulo c2 = new Circulo("Lila", 2);
		Circulo c3 = new Circulo("Blanco", 10);

		t1.mostrar();
		t2.mostrar();
		t3.mostrar();

		c1.mostrar();
		c2.mostrar();
		c3.mostrar();
		
		
		// b) Hallar el área de un triángulo dado los lados
		
		System.out.println("\ninciso b\n");
		System.out.println(t1.area());
		
		
		// c) Verificar si un triángulo es isósceles.
		System.out.println("\ninciso c\n");
		t3.isoceles();
		
		
		// d) Verificar si un triángulo es rectángulo.
		System.out.println("\n inciso d\n");
		t2.rectangulo();
		
		// e) Dados dos círculos, mostrar el circulo que tiene mayor área
		System.out.println("\n inciso e\n");
		c1.mayor_area(c2);
		
	}

}
