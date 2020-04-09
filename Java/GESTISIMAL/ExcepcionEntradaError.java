package gestisimal;
/**
 * Excepción para entrada de datos erronea
 * @author Alberto Miguel Martínez Jiménez
 *
 */
public class ExcepcionEntradaError extends Exception {
	public ExcepcionEntradaError() {
		super();
	}
	
	public ExcepcionEntradaError(String mensaje) {
		super(mensaje);
	}
/*
	@Override
	public String getMessage() {
		return "Error en la entrada de datos";
	}
	*/
}
