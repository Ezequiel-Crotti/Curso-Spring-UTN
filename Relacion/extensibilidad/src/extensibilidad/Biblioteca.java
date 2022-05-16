package extensibilidad;


public class Biblioteca {

	private Lector lector;
	
	public Biblioteca(Lector lector) {
		this.lector = lector;
	}
	
	public void solicitudDeLibro() {
		lector.solicitarLibro();
	}
}
