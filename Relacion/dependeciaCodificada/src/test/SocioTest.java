package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dependeciaCodificada.SimulacionSocio;

class SocioTest {

	private SimulacionSocio simulacionSocio;
	@BeforeEach
	void setUp() throws Exception {
		simulacionSocio = new SimulacionSocio();
	}

	@AfterEach
	void tearDown() throws Exception {
		simulacionSocio = null;
	}

	@Test
	void test() {
		
		try {
			simulacionSocio.solicitarLibro();
			if (simulacionSocio.isRealizoSolicitud()) {
				assertTrue(true);
			}else {
				fail("Fallo la invocacion");
			}
		} catch (Exception e) {
			
			fail("Fallo la invocacion " +e.getMessage());
		}
		
	}

}
