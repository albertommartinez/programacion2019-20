package arrays;

class Test {

	public static void main(String[] args) {
		int[] array = Arrays.generaArrayInt(10, 1, 10);
		for(int i=0;i<10;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("minimo-> "+Arrays.minimoArrayInt(array));
		System.out.println("maximo-> "+Arrays.maximoArrayInt(array));
		System.out.println("media-> "+Arrays.mediaArrayInt(array));
		if(Arrays.estaEnArrayInt(array, 5)) {
			System.out.println("El número 5 esta en el array");
		}else{
			System.out.println("El número 5  NO esta en el array");
		}
		
		int posicion = Arrays.posicionEnArray(array,5);
		if(posicion!=-1) {
			System.out.println("El número 5 se encuentra en la posición "+posicion);
		}else{
			System.out.println("El número 5 no esta en el el vector");
		}
		
		int[] arrayInvertido = Arrays.volteaArrayInt(array);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
		
		Arrays.rotaDerechaArrayInt(array, 3);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
		Arrays.rotaIzquierdaArrayInt(array, 4);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
	}

}
