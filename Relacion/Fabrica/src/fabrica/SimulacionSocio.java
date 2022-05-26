package fabrica;

public class SimulacionSocio extends Socio{
	
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
