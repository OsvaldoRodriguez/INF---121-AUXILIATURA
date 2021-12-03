import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivoPasajero {
	private String nom_arch;
	
	public ArchivoPasajero() {
		nom_arch = "";
	}
	
	public ArchivoPasajero(String nom_arch) {
		this.nom_arch = nom_arch;
	}
	
	public void crear() throws FileNotFoundException, IOException {
		ObjectOutputStream arch = new ObjectOutputStream(new FileOutputStream(nom_arch));
		arch.close();
		System.out.println("Archivo creado con nombre " + nom_arch);
	}
	
	public void adicionar() throws FileNotFoundException, IOException {
		String arch_aux = "pasajero_aux.dat";
		
		// donde voy a guardar los nuevos datos
		ObjectOutputStream arch_temp = new ObjectOutputStream(new FileOutputStream(arch_aux));
		// de donde voy a obtener los datos
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch));
		
		try {
			Pasajero p = new Pasajero();
			while(true) {
				p = (Pasajero) arch.readObject();
				arch_temp.writeObject(p);
			}
		}catch(Exception e){
			
		}finally {
			Pasajero p1 = new Pasajero();
			p1.leer();
			arch_temp.writeObject(p1);
			
			arch_temp.close();
			arch.close();
			
			File ARCH = new File(nom_arch);
			File ARCH_TEMP = new File(arch_aux);
			
			ARCH.delete();
			ARCH_TEMP.renameTo(ARCH);
			
		}
	
	}
	
	public void listar() throws FileNotFoundException, IOException {
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch));
		
		try {
			Pasajero p = new Pasajero();
			while(true) {
				p = (Pasajero) arch.readObject();
				p.mostrar();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			arch.close();
		}
	}
	
	
	
	public void destino_pasajero_nom_x(String nombre, String nom_arch_vuelo) throws FileNotFoundException, IOException {
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nom_arch));
		
		try {
			Pasajero p = new Pasajero();
			while(true) {
				p = (Pasajero) arch.readObject();
				
				if(p.getNombre_pasajero().equals(nombre)) {
					boolean flag = buscar_destino_pasajero_x(p.getCodigo(), nom_arch_vuelo);
					if(flag == false) {
						System.out.println("No existe tal vuelo");
					}
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			arch.close();
		}
	}
	
	public boolean buscar_destino_pasajero_x(String codigo_vuelo, String nombre_arch_vuelo) throws FileNotFoundException, IOException {
		ObjectInputStream arch = new ObjectInputStream(new FileInputStream(nombre_arch_vuelo));
		boolean flag = false;
		try {
			Vuelo v = new Vuelo();
			while(true) {
				v = (Vuelo) arch.readObject();
				
				if(v.getCodigo().equals(codigo_vuelo)) {
					System.out.println(v.getDestino());
					flag = true;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			arch.close();
		}
		return flag;
	}
	
}
