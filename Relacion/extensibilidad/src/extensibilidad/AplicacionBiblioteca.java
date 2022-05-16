package extensibilidad;


public class AplicacionBiblioteca {

	public static void main(String[] args) {
		
		Socio socio = new Socio();
		Biblioteca biblioteca = new Biblioteca(socio);
		biblioteca.solicitudDeLibro();

	}

}
