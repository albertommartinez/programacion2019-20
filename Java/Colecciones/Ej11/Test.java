package ej11;

class Test {

	public static void main(String[] args) {
		preguntar preguntas = new preguntar();
		
		preguntas.preguntas();
		System.out.println("Has tenido "+preguntas.correctas+" respuestas correctas");
		System.out.println("Has tenido "+preguntas.erroneas+" respuestas erroneas");

	}

}
