
public class MainMueble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a) Crear 2 Objeto roperos y 1 sillón (el constructor de la clase padre y de la clase derivada debe tener parámetros)
		Ropero r1 = new Ropero("madera", 45.5, "Cafe", 6, 1.2, 0.98);
		Ropero r2 = new Ropero("madera", 40.1, "Cafe", 1000000007, 1.8, 1.98);
		Sillon s1 = new Sillon("madera", 45.5, "Verde", 11);


		// b) Mostrar los datos de 2 roperos y 1 sillón
		
		r1.mostrar();
		r2.mostrar();
		s1.mostrar();
		
		// c) Verificar si un ropero tiene el mismo peso que un sillón
		System.out.println("\nInciso C\n");
		r1.verifica_peso(s1);
		
		// d) Dado 2 roperos mostrar el(los) ropero(s) que tengan un numero primo como la
//		cantidad de nro_cajas.
			System.out.println("\ninciso d\n");
			r1.verificar_caja();
			r2.verificar_caja();
	}

}
