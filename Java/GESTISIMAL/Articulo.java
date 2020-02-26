package gestisimal;
import recursos.*;

public class Articulo {
	private static int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;
	
	Articulo(String descripcion,double precioCompra,double precioVenta,int stock) {
		int codigo = this.getCodigo();
		this.setCodigo(codigo++);
		this.setPrecioCompra(precioCompra);
		this.setPrecioVenta(precioVenta);
		this.setStock(stock);
	}
	
	
	//---Getters & Setters
	public static int getCodigo() {
		return codigo;
	}
	public static void setCodigo(int codigo) {
		Articulo.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		if(this.precioCompra<this.precioVenta)
			this.precioVenta = precioVenta;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		if(this.stock>0)
			this.stock = stock;
	}


	@Override
	public String toString() {
		return "Articulo [descripcion=" + descripcion + ", precioCompra=" + precioCompra + ", precioVenta="
				+ precioVenta + ", stock=" + stock + "]";
	}
	
	
	
}
