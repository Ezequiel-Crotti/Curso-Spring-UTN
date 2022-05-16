package dependeciaCodificada;


public class Biblioteca {

	private Socio socio;
	//Socio socio = new Socio();
	
	public Biblioteca(Socio socio) {
		this.socio = socio;
	}
	
	public void solicitudDeLibro() {
		socio.solicitarLibro();
	}
}
