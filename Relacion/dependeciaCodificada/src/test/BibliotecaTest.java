package test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dependeciaCodificada.Biblioteca;
import dependeciaCodificada.SimulacionSocio;

class BibliotecaTest {

	Biblioteca biblioteca;
	private SimulacionSocio simulacionSocion = new SimulacionSocio();
	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca(simulacionSocion);
	}

	@AfterEach
	void tearDown() throws Exception {	
		biblioteca = null;
	}

	@Test
	void testSolicitudDeLibro() {
		try {
			biblioteca.solicitudDeLibro();
			if (simulacionSocion.isRealizoSolicitud()) {
				assertTrue(true);
			}else {
				fail("No se realizo la solicitud");
			}
			
		} catch (Exception e) {
			fail("Fallo la invocacion: " + e.getMessage());
		}
	}

}
