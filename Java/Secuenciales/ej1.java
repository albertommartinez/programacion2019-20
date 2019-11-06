import java.util.Scanner; //Importar la clase Scanner 
/**
* Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
* @author Alberto Miguel Martinez Jimenez
*/

//almacenar nombre (String)
//mostrar mensaje concatenado al nombre

public class ej1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
    
    System.out.println("¿Como te llamas? ");
    String nombre = scanner.nextLine();
    System.out.println("Hola "+nombre);
  }
}

