import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivoVuelo {
	private String nom_arch;
	
	public ArchivoVuelo() {
		nom_arch = "";
	}
	
	public ArchivoVuelo(String nom_arch) {
		this.nom_arch = nom_arch;
	}
	
	public void crear() throws FileNotFoundException, IOException {
		ObjectOutputStream arch = new ObjectOutputStream(new FileOutputStream(nom_arch));
		arch.close();
		System.out.println("Archivo creado con nombre " + nom_arch);
	}
	
	public void adicionar() throws FileNotFoundException, IOException {
		String nom_aux = "vuelo_aux.dat";
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch));
		ObjectOutputStream arch_temp = new ObjectOutputStream(new FileOutputStream(nom_aux));
	
		try {
			
			while(true) {
				Vuelo v = (Vuelo) arch.readObject();
				arch_temp.writeObject(v);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			Vuelo v = new  Vuelo();
			v.leer();
			
			arch_temp.writeObject(v);
			
			
			arch.close();
			arch_temp.close();
			
			
			File ARCH = new File(nom_arch);
			File ARCH_TEMP = new File(nom_aux);
			
			ARCH.delete();
			ARCH_TEMP.renameTo(ARCH);
		}
		
	}
	
	public void listar() throws FileNotFoundException, IOException {
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch));
		
		try {
			Vuelo v = new Vuelo();
			while(true) {
				v = (Vuelo) arch.readObject();
				v.mostrar();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			arch.close();
		}
	}
	
	
	public void cantidad_vuelos_xyz(String origen, String destino, String fecha, String nom_arch_pasajero) throws FileNotFoundException, IOException {
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch));
		
		try {
			Vuelo v = new Vuelo();
			while(true) {
				v = (Vuelo) arch.readObject();
				if(v.getOrigen().equals(origen) && v.getDestino().equals(destino) && v.getFecha().equals(fecha)) {
					System.out.println("el vuelo con codigo: " + v.getCodigo() + " tiene: " + cantidad_vuelos_cod_x(v.getCodigo(), nom_arch_pasajero) + " vuelos");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			arch.close();
		}
	}
	
	public int cantidad_vuelos_cod_x(String codigo, String nom_arch_pasajero) throws FileNotFoundException, IOException {
		int cantidad = 0;
		
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch_pasajero));
		
		try {
			Pasajero p = new Pasajero();
			while(true) {
				p = (Pasajero) arch.readObject();
				if(p.getCodigo().equals(codigo))
					cantidad++;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			arch.close();
		}
		return cantidad;
	}
	
}
