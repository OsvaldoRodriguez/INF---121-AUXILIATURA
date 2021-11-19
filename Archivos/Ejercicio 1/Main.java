import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		ArchivoAplicacion Arch = new ArchivoAplicacion("Aplicacion.dat");
		int op;
		try {
			
			do {
				System.out.println("MENU APLICACION");
				System.out.println("1: ALTA");
				System.out.println("2: LISTAR");
				System.out.println("3: BAJA(ELIMINAR)");
				System.out.println("4: APPS MAX TAMAÑO");
				System.out.println("5: Eliminar Aplic nombre X");
				System.out.println("6: APLICACION MULTIMEDIA");
				System.out.println("6: SALIR");
				op = in.nextInt();
				switch(op) {
					case 1: 
						
						Aplicacion ap = new Aplicacion();
						ap.leer();
						Arch.alta(ap.getCod_apl(), ap.getNombre(), ap.getTamanio(), ap.getCategoria());
						break;
					
					case 2:
						Arch.listar();
						break;
						
					case 3:
						System.out.println("digite el codigo a eliminar");
						int cod = in.nextInt();
						Arch.baja(cod);
						break;
						
					case 4:
						Arch.mostrar_aplic_mayor_tamanio();
						break;
					case 5:
						String nom = in.next();
						Arch.eliminar_apl_nom_x(nom);
						break;
					case 6:
						Arch.aplicaciones_cat_multimedia();
						break;
				}
			} while (op <= 6);
			
		} catch (IOException e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

}
