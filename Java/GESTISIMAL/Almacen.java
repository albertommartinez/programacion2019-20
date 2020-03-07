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
		
		if(!almacen.contains(articulo)) {
			almacen.add(articulo);
			return true;
		}else{
			return false;
		}	
	}
/**
 * Borrar articulo del almacen	
 * @param codigo int
 * @return boolean
 */
	public boolean borrarArticulo(int codigo) {
		//almacen.removeIf(almacen -> almacen.getCodigo() == codigo);
		if((codigo<almacen.size()-1)&&(codigo>-1)) {
			almacen.remove(codigo);
			return true;
		}
		return false;
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
/**
 * Devuelve el indice del almacen del articulo
 * del cuál se le ha pasado la desscripción por parámetro
 * si no lo encuentra devuelve -1	
 * @param descripcionArticulo String
 * @return int
 */
	private int buscarArticulo(String descripcionArticulo) {
		for(int i=0;i<almacen.size()-1;i++) {
			if(almacen.get(i).getDescripcion()==descripcionArticulo) {
				return i;
			}
		}
		return -1;
	}
	
	public void listarArticulos() {
		if(almacen.size()>0) {
			for(int i=0;i<almacen.size()-1;i++) {
				System.out.print(i+"."+almacen.get(i));
			}
		}else{
			System.out.println("No hay productos en el almacen");
		}
	}
	
@Override
public String toString() {
	
	return "Almacen [almacen=" + almacen + "]";
}
	
	
}
