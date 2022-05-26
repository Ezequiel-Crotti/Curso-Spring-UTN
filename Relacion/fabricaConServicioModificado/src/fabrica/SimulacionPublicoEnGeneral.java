package fabrica;

public class SimulacionPublicoEnGeneral extends publicoEnGeneral{

	private boolean realizoSolicitud;
	
	public boolean isRealizoSolicitud() {
		return realizoSolicitud;
	}

	@Override
	public void solicitarLibro() {
		super.solicitarLibro();
		realizoSolicitud = true;
	}
	
	
}
