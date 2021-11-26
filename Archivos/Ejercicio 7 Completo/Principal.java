import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomArchivo = "Estacion.dat";
		
		ArchivoEstacion arch = new ArchivoEstacion(nomArchivo);
		
		Scanner in = new Scanner(System.in);
		try {
			int opcion;
			do {
				System.out.println("\n ESTACION DE BUSES");
				System.out.println("1. CREAR");
				System.out.println("2. ADICIONAR");
				System.out.println("3. LISTAR");
				System.out.println("4. PERSONAS MAYOR A 18 AÑOS");
				System.out.println("5. ESTACION CON CHOFER X");
				System.out.println("6. CANTIDAD DE PASAJEROS MAYORES DE EDAD POR BUS");
				System.out.println("7. ELIMINAR BUS");
				System.out.println("8. SALIR");
				System.out.println();
				opcion = in.nextInt();
				
				switch (opcion) {
				case 1:
					arch.crear();
					break;
				case 2:
					arch.adicionar();
					break;
				case 3:
					arch.listar();
					break;
				case 4:
					System.out.println("digite el codigo de la estacion");
					int cod = in.nextInt();
					arch.mostrar_pasajeros_mayor_18_anios(cod, 18);
					break;
					
				case 5:
					System.out.println("digite nombre de chofer");
					String nombre = in.next();
					arch.mostrar_chofer_nombre_z(nombre);
					break;
					
				case 6:
					arch.personas_mayores_de_edad_por_bus_estacion(17);
					break;
					
				case 7:
					arch.eliminar_buses_con_menos_pasajeros();
					break;
				default:
					break;
				}
			} while (opcion <= 7);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		
		
	}

}
