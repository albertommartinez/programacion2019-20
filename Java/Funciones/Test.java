package matematicas;

public class Test {

	public static void main(String[] args) {
		System.out.println("esPrimo()");
		System.out.println("5-> "+Matematicas.esPrimo(5));
		System.out.println("4-> "+Matematicas.esPrimo(4));
		System.out.print("\n");
		System.out.println("potencia()");
		System.out.println("5^2="+Matematicas.potencia(5, 2));
		System.out.print("\n");
		System.out.println("digitos(123456789) : "+Matematicas.digitos(123456789));
		System.out.print("\n");
		System.out.println("juntaNumeros(50,4) : "+Matematicas.juntaNumeros(50,4));
		System.out.print("\n");
		System.out.println("voltea(123456789) : "+Matematicas.voltea(123456789));
		System.out.print("\n");
		System.out.println("siguientePrimo(4) : "+Matematicas.siguientePrimo(4));
		System.out.print("\n");
		System.out.println("esCapicua(454) : "+Matematicas.esCapicua(454));
		System.out.println("esCapicua(123) : "+Matematicas.esCapicua(123));
		System.out.print("\n");
		System.out.println("digitoN(12345,3) : "+Matematicas.digitoN(12345,3));
		System.out.print("\n");
		System.out.println("posicionDeDigito(123456789,5) : "+Matematicas.posicionDeDigito(123456789,5));
		System.out.print("\n");
		System.out.println("quitarPorDetras(123456789,3) : "+Matematicas.quitarPorDetras(123456789,3));
		System.out.print("\n");
		System.out.println("quitarPorDelante(123456789,3) : "+Matematicas.quitarPorDelante(123456789,3));
		System.out.print("\n");
		System.out.println("pegarPorDetras(12345,6789)"+Matematicas.pegarPorDetras(12345,6789));
		System.out.print("\n");
		System.out.println("pegarPorDelante(12345,6789)"+Matematicas.pegarPorDelante(12345,6789));
		System.out.print("\n");
		System.out.println("trozoDeNumero(123456789,3,7) :"+Matematicas.trozoDeNumero(123456789, 3, 7));
	}

}
