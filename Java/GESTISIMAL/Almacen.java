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
		
		  if(buscarArticulo(descripcion)==-1) {
		//if(!almacen.contains(articulo)) {
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
		/*if((codigo<(almacen.size()-1))&&(codigo>-1)) {
			almacen.remove(codigo);
			return true;
		}
		return false;*/
		int cod;
		for(Articulo art:almacen) {
			cod = art.getCodigo();
			if(cod == codigo) {
				almacen.remove(cod);
				return true;
			}
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
	public boolean decrementarProducto(int codigo,int decremento) {
		this.incrementarProducto(codigo, decremento * (-1));
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
	
	public int listarArticulos() {		
		//System.out.println("LLega");
		int tamannoAlmacen = almacen.size();
		//int i = 0;
		if(tamannoAlmacen>0) {
			//almacen.forEach((Articulo articulo) -> System.out.print(i+"."+articulo.getDescripcion()));
			
			
			for(int i=0;i<tamannoAlmacen;i++) {	
				this.mostrarArticulo(i);
				
			}
			return 0;
		}else{
			return -1;
		}
		
	}
	
@Override
public String toString() {
	
	return "Almacen [almacen=" + almacen + "]";
}

	
	
}
