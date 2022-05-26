package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fabrica.FabricaDeLectores;
import fabrica.Socio;
import fabrica.publicoEnGeneral;

class FabricaDeLectoresTest {

	private Socio socio;
	private publicoEnGeneral publicoEnGeneral;
	private FabricaDeLectores fabricaDeLectores;
	
	@BeforeEach
	void setUp() throws Exception {
		socio = new Socio();
		publicoEnGeneral = new publicoEnGeneral();
		fabricaDeLectores = new FabricaDeLectores();
	}

	@AfterEach
	void tearDown() throws Exception {
		socio = null;
		publicoEnGeneral = null ;
		fabricaDeLectores = null;
	}

	@Test
	public void nuevoSocio() {
		Socio s = fabricaDeLectores.nuevoSocio();
		if (s.getClass() == socio.getClass()) {
			assertTrue(true);
		}else {
			fail("No se creo un nuevo socio");
		}
	}
	
	@Test
	public void nuevoPublicoEnGeneral() {
		publicoEnGeneral p = fabricaDeLectores.nuevoPublicoEnGeneral();
		if (p.getClass() == publicoEnGeneral.getClass()) {
			assertTrue(true);
		}else {
			fail("No se creo un nuevo publicoEnGeneral");
		}
	}

}
