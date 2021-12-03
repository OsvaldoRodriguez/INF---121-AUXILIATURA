import java.util.Scanner;

public class Vuelo implements java.io.Serializable {
	private String codigo;
	private String fecha; // dd/mm/aaaa
	private String hora; // hh:mm
	private String origen;
	private String destino;
	public Vuelo(String codigo, String fecha, String hora, String origen, String destino) {
		this.codigo = codigo;
		this.fecha = fecha;
		this.hora = hora;
		this.origen = origen;
		this.destino = destino;
	}
	public Vuelo() {
		
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public void leer() {
		Scanner in = new Scanner(System.in);
		System.out.println("codigo - fecha - hora - origen - destino");
		codigo = in.next();
		fecha = in.next();
		hora = in.next();
		origen = in.next();
		destino = in.next();
	}
	
	public void mostrar() {
		System.out.println("VUELO");
		System.out.println("===========================");
		System.out.println("CODIGO: " + codigo);
		System.out.println("FECHA: " + fecha);
		System.out.println("HORA: " + hora);
		System.out.println("ORIGEN: " + origen);
		System.out.println("DESTINO: " + destino);
		System.out.println();
		
	}
	
	
	
}
