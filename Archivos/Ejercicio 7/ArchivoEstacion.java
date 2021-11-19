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
	
	
	
	
	
	
	
	
	
}
