package gestisimal;

import java.util.ArrayList;

public class Almacen {
	ArrayList<Articulo> almacen = new ArrayList<Articulo>();

/**
 * Añade articulo al almacen
 * @param descripcion String
 * @param precioCompra double
 * @param precioVenta  double
 * @param stock int
 */
	public boolean annadirArticulo(String descripcion,double precioCompra,double precioVenta,int stock) {
		Articulo articulo = new Articulo(descripcion,precioCompra,precioVenta,stock);
		almacen.add(articulo);
		return true;
	}
/**
 * Borrar articulo del almacen	
 * @param codigo int
 * @return boolean
 */
	public boolean borrarArticulo(int codigo) {
		almacen.remove(codigo);
		return true;
	}
/**
 * Incrementa el stock de un articulo	
 * @param codigo int
 * @param incremento int
 * @return boolean
 */
	public boolean incrementarProducto(int codigo,int incremento) {
		Articulo articulo = almacen.get(codigo);
		articulo.setStock(articulo.getStock() + incremento);
		return true;
	}
/**
 * Decrementa el stock de un articulo	
 * @param codigo int
 * @param decremento int
 * @return boolean
 */	
	public boolean decrementarProductor(int codigo,int decremento) {
		this.incrementarProducto(codigo, decremento*(-1));
		return true;
	}
/**
 * Devuelve el articulo	
 * @param codigo int
 */
	public void mostrarArticulo(int codigo) {
		Articulo articulo = almacen.get(codigo);
		System.out.println(articulo.toString());
	}
}
