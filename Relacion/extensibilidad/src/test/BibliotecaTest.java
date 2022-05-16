package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import extensibilidad.Biblioteca;
import extensibilidad.SimulacionPublicoEnGeneral;
import extensibilidad.SimulacionSocio;

class BibliotecaTest {

	private Biblioteca biblioteca1;
	private Biblioteca biblioteca2;
	private SimulacionSocio s = new SimulacionSocio();
	private SimulacionPublicoEnGeneral spg = new SimulacionPublicoEnGeneral();
	
	@BeforeEach
	void setUp() throws Exception {
		biblioteca1 = new Biblioteca(s);
		biblioteca2 = new Biblioteca(spg);
	}

	@AfterEach
	void tearDown() throws Exception {
		biblioteca1 = null;
		biblioteca2 = null;
	}

	@Test
	void test() {
		try {
			biblioteca1.solicitudDeLibro();
			if (s.isRealizoSolicitud()) {
				assertTrue(true);
			}else {
				fail("No se realizo la solicitud del Socio");
			}
			biblioteca2.solicitudDeLibro();
			if (spg.isRealizoSolicitud()) {
				assertTrue(true);
			}else {
				fail("No se realizo la solicitud del Publico");
			}
		} catch (Exception e) {
			fail("Fallo la invocacion: " + e.getMessage());
		}
		
		fail("Not yet implemented");
	}

}
