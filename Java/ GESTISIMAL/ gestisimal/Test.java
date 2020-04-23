package gestisimal;

import recursos.Menu;
import recursos.Teclado;
import java.util.ArrayList;
import java.util.Arrays;

public class Test  {

	public static void main(String[] args) throws ExcepcionEntradaError {
		Almacen almacen = new Almacen();
		int opcion;
		String descripcion = "";
		double precioCompra = 0;
		double precioVenta = 0;
		int stock = 0;
		int codigo;
		boolean salir = false;
		//String nombreArchivo;
		
		String[] opciones = {"Añadir Articulo","Eliminar Articulo","Incrementar Articulo","Decrementar Articulo","Mostrar Articulos","Exportar a XML","Salir"};
				
					do {
						try {
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
									
									if(almacen.listarArticulos()==0) {
										opcion = Teclado.leerEntero("Introduce código del articulo a borrar: ");
										almacen.borrarArticulo(opcion);
									}else{
										System.out.println("No hay articulos en el almacen.");
									}
									break;
								case 3:
									codigo = Teclado.leerEntero("Introduce código de artículo: ");
									int incremento = Teclado.leerEntero("Introduce cantidad a incrementar: ");
									almacen.incrementarProducto(codigo, incremento);
									break;
								case 4:
									codigo = Teclado.leerEntero("Introduce código de artículo: ");
									int decremento = Teclado.leerEntero("Introduce cantidad a decrementar: ");
									almacen.decrementarProducto(codigo, decremento);
									break;
								case 5:
									//almacen.listarArticulos();
									if(almacen.listarArticulos()!=0) {
										System.out.println("--------------------------------");
										System.out.println(" No hay productos en el almacén ");
										System.out.println("--------------------------------");
									}
									break;
								case 6:
									almacen.exportarAXML(Teclado.leerCadena("¿Como llamarás al documento XML?"));
									
									break;
								case 7:
									salir = true;
									break;
								
							}
						}catch(Exception ExcepcionEntradaError) {
							throw new ExcepcionEntradaError("Error en entrada de datos.Solo valores entre 1 y 6");
							
						} 
					}while((!salir)||((!(opcion>0)&&(opcion<7))));
		
	}

}
