import java.util.Scanner;

public class Vehiculo {
	protected int nro_ruedas;
	protected String motor;
	protected String tipo_combustible;

	public

		Vehiculo(int nro_ruedas, String motor, String tipo_combustible){
			this.nro_ruedas = nro_ruedas;
			this.motor = motor;
			this.tipo_combustible = tipo_combustible;
		}


		void leer(){
			Scanner in = new Scanner(System.in);
			System.out.println("nro_ruedas + motor + tipo_combustible");
			nro_ruedas = in.nextInt();
			motor = in.next();
			tipo_combustible = in.next();
			// in.nextLine();
		} 

		void mostrar(){
			
			System.out.println("nro_ruedas: " + nro_ruedas);
			System.out.println("motor: " + motor);
			System.out.println("tipo_combustible: " + tipo_combustible);
		}


		public int getNro_ruedas() {
			return nro_ruedas;
		}


		public void setNro_ruedas(int nro_ruedas) {
			this.nro_ruedas = nro_ruedas;
		}


		public String getMotor() {
			return motor;
		}


		public void setMotor(String motor) {
			this.motor = motor;
		}


		public String getTipo_combustible() {
			return tipo_combustible;
		}


		public void setTipo_combustible(String tipo_combustible) {
			this.tipo_combustible = tipo_combustible;
		} 

		
		
}
