package fabrica;

public class publicoEnGeneral implements Lector {

	@Override
	public void solicitarLibro() {
		System.out.println("Persona del publico en general solicita un libro a la biblioteca");
	}

}
