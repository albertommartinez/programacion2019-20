package gestisimal;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

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
	
	public void exportarAXML(String nombreFichero) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();
			
			//Definir elemento raiz XML
			Element eRaiz = doc.createElement("almacen");
			doc.appendChild(eRaiz);
			
			String[] elementos = {"codigo","descripcion","precioCompra","precioVenta","stock"};
			

			/*
			 * bucle crear  elementos de cada productoº
			 * 
			 */
			for(int i=0;i<almacen.size()-1;i++) {
				exportarArticuloAXML(doc,eRaiz,elementos);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(nombreFichero + ".xml"));
			
			transformer.transform(source, result);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void exportarArticuloAXML(Document doc, Element eRaiz,String[] elementos) {
		
		//Definir el nodo que contiene los elementos
		Element eArticulo = doc.createElement("articulo");
		eRaiz.appendChild(eArticulo);
		
		//Definir elementos de articulo
		Element eCodigo = doc.createElement("codigo");
		eCodigo.appendChild(doc.createTextNode(elementos[0]));//codigo debe pasarse por parametro
		eArticulo.appendChild(eCodigo);
		
		Element eDesc = doc.createElement("descripcion");
		eDesc.appendChild(doc.createTextNode(elementos[1]));//descripcion debe pasarse por parametro
		eArticulo.appendChild(eDesc);
		
		Element ePrecioComp = doc.createElement("precioCompra");
		ePrecioComp.appendChild(doc.createTextNode(elementos[2]));//precioCompra debe pasarse por parametro
		eArticulo.appendChild(ePrecioComp);
		
		Element ePrecioVent = doc.createElement("precioVenta");
		ePrecioVent.appendChild(doc.createTextNode(elementos[3]));//precioVenta debe pasarse por parametro
		eArticulo.appendChild(ePrecioVent);
		
		Element eStock = doc.createElement("Stock");
		eStock.appendChild(doc.createTextNode(elementos[4]));//stock debe pasarse por parametro
		eArticulo.appendChild(eStock);
	}
	
@Override
public String toString() {
	
	return "Almacen [almacen=" + almacen + "]";
}

	
	
}
