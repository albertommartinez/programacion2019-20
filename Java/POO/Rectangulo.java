package rectangulo;

public class Rectangulo {
	private double base;
	private double altura;
	private int ladoMaximo = 10;
	static int contadorRectangulos = 0; 
	
	//Constructor
	Rectangulo(double base, double altura) {
		if((ladoCorrecto(base))&&(ladoCorrecto(altura))) {
			setBase(base);
			setAltura(altura);
			contadorRectangulos++;
		}
	}
/**
 * comprueba que el lado corresponda a un rango correcto 	
 * @param lado double
 * @return boolean
 */
	public boolean ladoCorrecto(double lado) {
		if( (lado<ladoMaximo)&&(lado>0)) {
			return true;
		}
		return false;
	}
/**
 * devuelve el perímetro del rectángulo
 * @return double
 */
	public double perimetro() {
		return (base*2)+(altura*2);
	}
/**
 * devuelve el del rectángulo
 * @return double
 */	
	public double area() {
		return base*altura;
	}
/**
 * pinta el rectángulo en pantalla	
 */
	public void muestra() {
		System.out.println("Base: "+this.base);
		System.out.println("Altura: "+this.altura);
	}
/**
 * compara dos objetos retangulo	
 * @param rectangulo
 * @return int
 */
	public int compara(Rectangulo rectangulo) {
		double comparacion = this.area()-rectangulo.area();
		if(comparacion<0) {
			return -1;//rectangulo es el mayor
		}if(comparacion>0) {
			return 1;//rectangulo es el menor
		}else {
			return 0;//ambos son iguales
		}
	}
/**
 * devuelve si ambos rectangulos son gemelos	
 * @param Rectangulo rectangulo
 * @return boolean
 */
	public boolean esGemelo(Rectangulo rectangulo) {
		if((this.base == rectangulo.base)&&(this.altura == rectangulo.altura)) {
			return true;
		}
		return false;
	}
//Getters y Setters
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setContadorRectangulos(int contadorRectangulos) {
		this.contadorRectangulos = contadorRectangulos;
	}
	
	
	
	
	
}
