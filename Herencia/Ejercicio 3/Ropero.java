import java.util.Scanner;

public class Ropero extends Mueble{
	private 
		int nro_cajas;
		double altura;
		double ancho;

	public

	int obt_nro_cajas(){
		return nro_cajas;
	}
	double obt_altura(){
		return altura;
	}
	double obt_ancho(){
		return ancho;
	}
	
	Ropero(String _mat, double _peso, String _color, int cajas, double _altura, double _ancho){
		super(_mat, _peso, _color);
		nro_cajas = cajas;
		altura = _altura;
		ancho = _ancho;
	} 

	public void leer(){
		System.out.println("ROPERO");
		Scanner in = new Scanner(System.in);
		super.leer();
		System.out.println("cajas + altura + ancho");
		nro_cajas = in.nextInt();
		altura = in.nextDouble();
		ancho = in.nextDouble();
		
	}

	public void mostrar(){
		System.out.println("ROPERO");
		super.mostrar();
		System.out.println("nro_cajas: " + nro_cajas);
		System.out.println("altura: " + altura);
		System.out.println("ancho: " + ancho);
		
		
	}
	
	
	public void verifica_peso(Sillon s1) {
		String ans = "no ";
		if(super.peso == s1.obt_peso()) {
			ans = "si ";
		}
		System.out.println(ans + " tiene el mismo peso");
	}
	
	void verificar_caja(){
		if(es_primo(nro_cajas)){
			this.mostrar();
		}
	}

	boolean es_primo(int x){
		if(x == 2)
			return true;
		if(x < 2 || x % 2 == 0)
			return false;

		for(int i = 3; i * i <= x; i += 2){
			if(x % i == 0)
				return false;
		}
		return true;
	}
}
