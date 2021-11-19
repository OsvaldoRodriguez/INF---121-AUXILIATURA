import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchivoAplicacion {
	private String nombre_archivo;
	private int codigo;
	ArchivoAplicacion(){
		nombre_archivo = "";
	}

	ArchivoAplicacion(String n_a){
		nombre_archivo = n_a;
	}
	

	// adicionar
	public void alta(int cod, String nom, double tam, String cat){
		DataOutputStream Arch = null;
		try {
			
			Arch = new DataOutputStream(new FileOutputStream(nombre_archivo, true));
			// escribir dato por dato
			
			Arch.writeInt(cod);
			Arch.writeUTF(nom);
			Arch.writeDouble(tam);
			Arch.writeUTF(cat);
			
			Arch.close();
			
			
		} catch (IOException ioe) {
			
		}
	}

	// eliminar 
	public void baja(int x){
		DataInputStream Arch = null;
		DataOutputStream ArchTemp = null;
		
		try {
			Arch = new DataInputStream(new FileInputStream(nombre_archivo));
			ArchTemp = new DataOutputStream(new FileOutputStream("AplicacionAux.dat", true));
			while(true) {
				Aplicacion ap = new Aplicacion();
				ap.setCod_apl(Arch.readInt());
				ap.setNombre(Arch.readUTF());
				ap.setTamanio(Arch.readDouble());
				ap.setCategoria(Arch.readUTF());
				
				if(ap.getCod_apl() != x) {
					
					ArchTemp.writeInt(ap.getCod_apl());
					ArchTemp.writeUTF(ap.getNombre());
					ArchTemp.writeDouble(ap.getTamanio());
					ArchTemp.writeUTF(ap.getCategoria());
				}
			}
			
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		try {
			Arch.close();
			ArchTemp.close();
			
			File arch1 = new File(nombre_archivo);
			File arch2 = new File("AplicacionAux.dat");
			
			if(arch1.exists())
				arch1.delete();
			
			arch2.renameTo(arch1);
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	
	}


	public void listar() throws IOException{
		DataInputStream Arch = null;
		try {
			
			Arch = new DataInputStream(new FileInputStream(nombre_archivo));
			// escribir dato por dato
			
			
			while(true) {
				Aplicacion ap = new Aplicacion();
				ap.setCod_apl(Arch.readInt());
				ap.setNombre(Arch.readUTF());
				ap.setTamanio(Arch.readDouble());
				ap.setCategoria(Arch.readUTF());
				ap.mostrar();
				
			}
			
			
		} catch (IOException ioe) {
			Arch.close();
		}
	}
	
	public void mostrar_aplic_mayor_tamanio() throws IOException{
		DataInputStream Arch = null;
		double mx = 0;
		
		try {
			
			Arch = new DataInputStream(new FileInputStream(nombre_archivo));
			// escribir dato por dato
			
			// maximizar
			while(true) {
				Aplicacion ap = new Aplicacion();
				ap.setCod_apl(Arch.readInt());
				ap.setNombre(Arch.readUTF());
				ap.setTamanio(Arch.readDouble());
				ap.setCategoria(Arch.readUTF());
//				ap.mostrar();
				mx = Math.max(mx, ap.getTamanio());
				
			}
		} catch (IOException ioe) {
			Arch.close();
		}
		
		
		// para mostrar
		try {
			
			Arch = new DataInputStream(new FileInputStream(nombre_archivo));
			// escribir dato por dato
			
			// maximizar
			
			while(true) {
				Aplicacion ap = new Aplicacion();
				ap.setCod_apl(Arch.readInt());
				ap.setNombre(Arch.readUTF());
				ap.setTamanio(Arch.readDouble());
				ap.setCategoria(Arch.readUTF());
//				ap.mostrar();
				if(mx == ap.getTamanio()) {
					ap.mostrar();
				}
				
			}
		} catch (IOException ioe) {
			Arch.close();
		}
	}
	
	
	public void eliminar_apl_nom_x(String nombre) {
		DataInputStream Arch = null; // archivo que tengo
		DataOutputStream ArchTemp = null; // archivo de salida
		
		try {
			Arch = new DataInputStream(new FileInputStream(nombre_archivo));
			ArchTemp = new DataOutputStream(new FileOutputStream("AplicacionAux.dat", true));
			while(true) {
				Aplicacion ap = new Aplicacion();
				ap.setCod_apl(Arch.readInt());
				ap.setNombre(Arch.readUTF());
				ap.setTamanio(Arch.readDouble());
				ap.setCategoria(Arch.readUTF());
				
				if(! nombre.equals(ap.getNombre())) {
					
					ArchTemp.writeInt(ap.getCod_apl());
					ArchTemp.writeUTF(ap.getNombre());
					ArchTemp.writeDouble(ap.getTamanio());
					ArchTemp.writeUTF(ap.getCategoria());
				}
			}
			
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		try {
			Arch.close();
			ArchTemp.close();
			
			File arch1 = new File(nombre_archivo); // Aplicacion.dat
			File arch2 = new File("AplicacionAux.dat");
			
			if(arch1.exists())
				arch1.delete();
			
			arch2.renameTo(arch1);
			
		} catch (IOException e) {
			// TODO: handle exception
		}

	}
	
	
	public void aplicaciones_cat_multimedia() throws IOException {
		DataInputStream Arch = null;
		try {
			
			Arch = new DataInputStream(new FileInputStream(nombre_archivo));
			// escribir dato por dato
			
			
			while(true) {
				Aplicacion ap = new Aplicacion();
				ap.setCod_apl(Arch.readInt());
				ap.setNombre(Arch.readUTF());
				ap.setTamanio(Arch.readDouble());
				ap.setCategoria(Arch.readUTF());
				if(ap.getCategoria().equals("Multimedia")) {
					ap.mostrar();
				}
				
			}
			
			
		} catch (IOException ioe) {
			Arch.close();
		}
	}
}
