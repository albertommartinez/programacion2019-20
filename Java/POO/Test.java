package rectangulo;

public class Test {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(5,4);
		
		System.out.println("area-> "+r1.area());
		System.out.println("perimetro->"+r1.perimetro());
		System.out.println("Cantidad rectangulos-> "+Rectangulo.contadorRectangulos);
		r1.muestra();
		System.out.println(r1.compara(new Rectangulo(3,5)));
		System.out.println(r1.esGemelo(new Rectangulo(3,5)));
	}

}
