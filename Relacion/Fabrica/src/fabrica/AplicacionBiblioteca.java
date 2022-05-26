package fabrica;


public class AplicacionBiblioteca {

	public static void main(String[] args) {
		
		FabricaDeLectores f = new FabricaDeLectores();
		
		Lector lector1 = f.nuevoSocio();
		Lector lector2 = f.nuevoPublicoEnGeneral();
		
		Biblioteca biblioteca1 = new Biblioteca(lector1);
		Biblioteca biblioteca2 = new Biblioteca(lector2);
		
		
		biblioteca1.solicitudDeLibro();
		biblioteca2.solicitudDeLibro();

	}

}
