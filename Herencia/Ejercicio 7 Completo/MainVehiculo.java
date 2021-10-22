import java.util.Scanner;

public class MainVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new  Scanner(System.in);
//		VehiculoTerrestre v = new VehiculoTerrestre(5, "m1", "gasolina", "123-ACB", "marca1");
//		v.mostrar();
		
//		VehiculoAereo v = new VehiculoAereo(5, "m1", "gasolina", "modelo1", 4545.3);
//		v.mostrar();
		
		
//		a)
		
		Tractor t = new Tractor(5, "m1", "gasolina", "123-ACB", "marca1", 3434);
		t.mostrar();
		
		Bus b = new Bus(5, "m1", "gasolina", "123-ACB", "marca1", 34);
		b.mostrar();
		
		
//		
		
		Avion a = new Avion(6, "m1", "gasolina", "modelo1", 3434, 125);
		a.mostrar();
		Avion a1 = new Avion(8, "m2", "gasolina", "modelo2", 334, 125);
		a1.mostrar();
		Helicoptero h = new Helicoptero(6, "m1", "gasolina", "modelo1", 3434, 11);
		h.mostrar();
		Helicoptero h1 = new Helicoptero(7, "m1", "gasolina", "modelo1", 34341, 11);
		h1.mostrar();
		
		// b Dado un tractor y un Bus verificar si tienen el mismo motor y la misma marca
		System.out.println("===================\n inciso b\n");
		t.mismo_motor_marca(b);
		
		// b.mismo_motor_marca(t);
		
		
		// c) Dados dos vehículos aéreos de tipo Avion mostrar el modelo del avión que tiene
//		mayor velocidad
		System.out.println("===================\n inciso c\n");
		
		a.misma_velocidad(a1);
		
		// d) Dado dos helicópteros verificar si ambos tienen la misma cantidad de hélices y
//		pueden alcanzar la misma altitud (máxima)
		System.out.println("===================\n inciso d\n");
		
		h.misma_velocidad_altitud(h1);
		
		// e) Crear n aviones y ordenarlos ascendentemente por la altitud máxima que pueden
//		alcanzar.
		System.out.println("===================\n inciso e\n");
		
		
		int n = 4; // lectura por teclado
		n = in.nextInt();
		Avion avion[] = new Avion[100];
		
		for(int i = 0; i < n; i++) {
			avion[i] = new Avion(6, "m1", "gasolina", "modelo1", 3434, 125);
			avion[i].leer();
		}
		
		for(int i = 0; i < n; i++) {
			avion[i].mostrar();
		}
		// respeta las posiciones originales
		OrdenarAviones(avion, n);
		mostrar(avion, n);
		
		// f Crear n aviones y ordenar ascendemente 
		// primero por altitud maxima, si son iguales, ordenar por el nro de ruedas, pero el que sea mayor
		
		System.out.println("===================\n inciso f\n");
		
		OrdenarAviones1(avion, n);
		mostrar(avion, n);
		
	}
	
	
	public static void OrdenarAviones(Avion avion[], int n) {
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(avion[i].obt_altitud_maxima() > avion[j].obt_altitud_maxima()) {
					Avion aux = avion[i];
					avion[i] = avion[j];
					avion[j] = aux;
				}
			}
		}
	}
	
	public static void OrdenarAviones1(Avion avion[], int n) {
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				int posi = -1, posj = -1;
				if(avion[i].obt_altitud_maxima() == avion[j].obt_altitud_maxima()) {
					// recien se compara por el segundo parametro
					// ordenar de manera decreciente por el segundo parametro
					if(avion[i].getNro_ruedas() < avion[j].getNro_ruedas()) {
						posi = i;
						posj = j;
					}
				}else { // son diferentes
					if(avion[i].obt_altitud_maxima() > avion[j].obt_altitud_maxima()) {
						posi = i;
						posj = j;
					}
				}
				
				if(posi != -1 && posj != -1) {
					Avion aux = avion[i];
					avion[i] = avion[j];
					avion[j] = aux;
				}
			}
		}
	}
	
	public static void mostrar(Avion avion[], int n) {
		for(int i = 0; i < n; i++) {
			avion[i].mostrar();
		}
	}

}
