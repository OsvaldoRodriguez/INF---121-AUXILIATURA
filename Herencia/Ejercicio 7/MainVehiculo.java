
public class MainVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		VehiculoTerrestre v = new VehiculoTerrestre(5, "m1", "gasolina", "123-ACB", "marca1");
//		v.mostrar();
		
//		VehiculoAereo v = new VehiculoAereo(5, "m1", "gasolina", "modelo1", 4545.3);
//		v.mostrar();
		
		
//		a)
		
		Tractor t = new Tractor(5, "m1", "gasolina", "123-ACB", "marca1", 3434);
		t.mostrar();
		
		Bus b = new Bus(5, "m1", "gasolina", "123-ACB", "marca1", 34);
		b.mostrar();
		
		
//		
		
		Avion a = new Avion(6, "m1", "gasolina", "modelo1", 3434, 125);
		a.mostrar();
		Helicoptero h = new Helicoptero(6, "m1", "gasolina", "modelo1", 3434, 10);
		h.mostrar();
		
		// b
		
		t.mismo_motor_marca(b);
		
	}

}
