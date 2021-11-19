
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomArchivo = "Estacion.dat";
		
		ArchivoEstacion arch = new ArchivoEstacion(nomArchivo);
		
		try {
//			arch.crear();
//			arch.adicionar();
			arch.listar();
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		
		
	}

}
