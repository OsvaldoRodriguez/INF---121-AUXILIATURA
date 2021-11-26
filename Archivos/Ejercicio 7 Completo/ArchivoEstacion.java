import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivoEstacion {
	private String nom_arch;

	public ArchivoEstacion(String nom_arch) {
		this.nom_arch = nom_arch;
	}
	
	public void crear() throws FileNotFoundException, IOException {
		ObjectOutputStream arch = new ObjectOutputStream(new FileOutputStream(nom_arch));
		arch.close();
		System.out.println("archivo creado con el nombre: " + nom_arch);
	}
	
	public void adicionar() throws FileNotFoundException, IOException {
		ObjectOutputStream arch1 = new ObjectOutputStream(new FileOutputStream("EstacionTemp.dat"));
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch));
		
		try {
			Estacion e = new Estacion();
			while(true) {
				e = (Estacion) arch.readObject();
				arch1.writeObject(e);
			}
		} catch (Exception e) {
			// TODO: handle exception
			// para adicionar
			
			Estacion ee = new Estacion();
			ee.leer();
			arch1.writeObject(ee);
			arch.close();
			arch1.close();
			
			File n_arch = new File(nom_arch);
			File arch_t = new File("EstacionTemp.dat");
			
			n_arch.delete();
			arch_t.renameTo(n_arch);
			
		}
	}
	
	public void listar() throws FileNotFoundException, IOException {
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch));
		try {			
			while(true) {
				Estacion e = new Estacion();
				e = (Estacion) arch.readObject();	
				e.mostrar();
			}
		}catch (Exception e) {
			// TODO: handle exception
			
		}finally {
			arch.close();
		}
	}
	
	
	public void mostrar_pasajeros_mayor_18_anios(int codigo, int edad) throws FileNotFoundException, IOException {
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch));
		try {			
			while(true) {
				Estacion e = new Estacion();
				e = (Estacion) arch.readObject();	
				// 
				// recorre todos los buses de la estacion
				if(e.getCodigo_estacion() == codigo) {
					for(int i = 0; i < e.getNro_buses(); i++) { // vector de buses
						for(int j = 0; j < e.getB()[i].getNro_pasajeros(); j++) { // vector de pasajeros de cada bus
							if(e.getB()[i].getP()[j].edad() > edad) {
								e.getB()[i].getP()[j].mostrar();
							}
						}
					}
				}
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			
		}finally {
			arch.close();
		}
	}
	
	public void mostrar_chofer_nombre_z(String nombre) throws FileNotFoundException, IOException {
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch));
		try {			
			while(true) {
				Estacion e = new Estacion();
				e = (Estacion) arch.readObject();	
				// 
				// recorre todos los buses de la estacion
				for(int i = 0; i < e.getNro_buses(); i++) { // vector de buses
					Persona chofer = e.getB()[i].getChofer();
					if(chofer.getNombre().equals(nombre)) {
						e.mostrar();
					}
				}
			
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			
		}finally {
			arch.close();
		}
	}
	
	
	public void personas_mayores_de_edad_por_bus_estacion(int edad) throws FileNotFoundException, IOException {
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch));
		try {			
			while(true) {
				Estacion e = new Estacion();
				e = (Estacion) arch.readObject();	
				// 
				// recorre todos los buses de la estacion
				System.out.println("COD ESTACION: " + e.getCodigo_estacion());
				for(int i = 0; i < e.getNro_buses(); i++) { // vector de buses
					// inicializar contador
					int cnt = 0;
					for(int j = 0; j < e.getB()[i].getNro_pasajeros(); j++) {
						Persona pasajero = e.getB()[i].getP()[j];
						if(pasajero.edad() > edad) {
							cnt++;
						}
					}
					System.out.println("BUS " + (i + 1) + " Tiene " + cnt + " de pasajeros mayores de edad");
					
				}
			
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			
		}finally {
			arch.close();
		}
	}
	
	public void eliminar_buses_con_menos_pasajeros() throws FileNotFoundException, IOException {
		ObjectOutputStream arch1 = new ObjectOutputStream(new FileOutputStream("EstacionTemp.dat"));
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch));
		
		try {
			Estacion e = new Estacion();
			while(true) {
				e = (Estacion) arch.readObject();
				
				// si es que necesito
				
				// vamos a contar el numero de pasajeros por bus de cada estacion
				int minimo = 1000000;
				for(int i = 0; i < e.getNro_buses(); i++) {
					int nro_pasajeros = e.getB()[i].getNro_pasajeros();
					if(nro_pasajeros < minimo) {
						minimo = nro_pasajeros;

					}
				}
				
				
				//
				
				for(int i = 0; i < e.getNro_buses(); i++) {
					int nro_pasajeros = e.getB()[i].getNro_pasajeros();
					
					if(nro_pasajeros == minimo) {
						for(int j = i + 1; j < e.getNro_buses(); j++) {
							e.setB(e.getB()[j], j - 1);
						}
						e.setNro_buses(e.getNro_buses() - 1);
					}
				}
				// aqui ya se la cantidad minima de pasajeros de una estacion
				
//				e.mostrar();
				arch1.writeObject(e);
				
				
				/*
					// eliminar estacion completa
					if(e.getCodigo_estacion() != x) {
						arch1.writeObject(e);
				}
				*/
			}
		} catch (Exception e) {
			// TODO: handle exception
			// para adicionar
			
			
			arch.close();
			arch1.close();
			
			File n_arch = new File(nom_arch);
			File arch_t = new File("EstacionTemp.dat");
			
			n_arch.delete();
			arch_t.renameTo(n_arch);
			
		}
	}
	
	
	
	
	
	
	
	
	
}
