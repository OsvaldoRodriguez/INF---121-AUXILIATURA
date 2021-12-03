import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String nom_arch_pasajero = "pasajero.dat";
		String nom_arch_vuelo = "vuelo.dat";
		ArchivoPasajero ap = new ArchivoPasajero(nom_arch_pasajero);
		ArchivoVuelo av = new ArchivoVuelo(nom_arch_vuelo);
		Scanner in = new Scanner(System.in);
		int opcion;
		
		try {
			do {
				System.out.println("1. Crear Pasajero");
				System.out.println("2. Adicionar Pasajero");
				System.out.println("3. Listar Pasajero");
				System.out.println("4. Crear Vuelo");
				System.out.println("5. Adicionar Vuelo");
				System.out.println("6. Listar Vuelo");
				System.out.println("7. Destino del pasajero con nombre X");
				System.out.println("8. Contar vuelos (origen, destino, fecha)");
				System.out.println("9. Salir");
				opcion = in.nextInt();
				switch (opcion) {
				case 1:
					ap.crear();
					break;
				case 2:
					ap.adicionar();
					break;
				case 3:
					ap.listar();
					break;
				case 4:
					av.crear();
					break;
					
				case 5:
					av.adicionar();
					break;
					
				case 6:
					av.listar();
					break;
					
				case 7:
					System.out.println("Introduzca nombre del pasajero");
					String nom_pasajero = in.next();
					ap.destino_pasajero_nom_x(nom_pasajero, nom_arch_vuelo);
					break;
					
				case 8:
					System.out.println("digite origen - destino - fecha");
					av.cantidad_vuelos_xyz(in.next(), in.next(), in.next(), nom_arch_pasajero);
					break;
				default:
					break;
				}
				
			} while (opcion <= 8);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
