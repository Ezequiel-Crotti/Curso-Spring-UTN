package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import extensibilidad.Biblioteca;
import extensibilidad.SimulacionPublicoEnGeneral;
import extensibilidad.SimulacionSocio;

class BibliotecaTest {

	private Biblioteca biblioteca1;
	private Biblioteca biblioteca2;
	private SimulacionSocio s = new SimulacionSocio();
	private SimulacionPublicoEnGeneral spg = new SimulacionPublicoEnGeneral();
	
	@Before
	void setUp() throws Exception {
		biblioteca1 = new Biblioteca(s);
		biblioteca2 = new Biblioteca(spg);
	}

	@After
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
