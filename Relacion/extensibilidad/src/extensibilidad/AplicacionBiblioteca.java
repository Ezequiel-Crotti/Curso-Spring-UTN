package extensibilidad;


public class AplicacionBiblioteca {

	public static void main(String[] args) {
		
		Lector lector1 = new Socio();
		Lector lector2 = new publicoEnGeneral();
		
		Biblioteca biblioteca1 = new Biblioteca(lector1);
		Biblioteca biblioteca2 = new Biblioteca(lector2);
		
		
		biblioteca1.solicitudDeLibro();
		biblioteca2.solicitudDeLibro();

	}

}
