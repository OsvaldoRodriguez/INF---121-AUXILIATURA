
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola c = new Cola();
		
		c.adicionar(10);
		c.adicionar(30);
		System.out.println("Eliminar " + c.eliminar());
		c.adicionar(100);
		System.out.println("Eliminar " + c.eliminar());
		System.out.println("Eliminar " + c.eliminar());
		
		System.out.println(c.length());
	}

}
