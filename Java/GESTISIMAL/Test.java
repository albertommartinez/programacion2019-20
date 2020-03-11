package gestisimal;

import recursos.Menu;
import recursos.Teclado;
import java.util.ArrayList;
import java.util.Arrays;

class Test {

	public static void main(String[] args) {
		Almacen almacen = new Almacen();
		int opcion;
		String descripcion = "";
		double precioCompra = 0;
		double precioVenta = 0;
		int stock = 0;
		String[] opciones = {"Añadir Articulo","Eliminar Articulo","Incrementar Articulo","Decrementar Articulo","Mostrar Articulo"};
		
		
		do {
			opcion = Menu.crearMenu("GESTISIMAL", opciones);
			switch(opcion) {
				case 1:
					descripcion = Teclado.leerCadena("Introduce descripción :");
					precioCompra = Teclado.leerDecimal("Introduce el precio de compra :");
					precioVenta = Teclado.leerDecimal("Introduce el precio de venta :");
					stock = Teclado.leerEntero("Introduce el stock disponible :");
					almacen.annadirArticulo(descripcion, precioCompra, precioVenta, stock);
					almacen.mostrarArticulo(almacen.almacen.size()-1);//muestra el ultimo articulo añadido(longitud almacen-1)
					break;
				case 2:
					
					almacen.listarArticulos(almacen);
					opcion = Teclado.leerEntero("Introduce indice del articulo a borrar: ");
					
				case 3:
					
					int incremento = Teclado.leerEntero("Introduce cantidad a incrementar: ");
					
				case 5:
					//almacen.toString();
					almacen.listarArticulos(almacen);   
			}
		}while(opcion!=0);
	}

}