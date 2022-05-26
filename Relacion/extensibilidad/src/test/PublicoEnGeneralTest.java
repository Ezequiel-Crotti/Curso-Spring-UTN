package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import extensibilidad.publicoEnGeneral;

public class PublicoEnGeneralTest {

	private publicoEnGeneral publicoEnGeneral;
	
	@Before
	public void setUp() throws Exception {
		publicoEnGeneral = new publicoEnGeneral();
	}

	@After
	public void tearDown() throws Exception {
		publicoEnGeneral = null;
	}

	@Test
	public void test() {
		try {
			publicoEnGeneral.solicitarLibro();
			assertTrue(true);
		} catch (Exception e) {
			fail("Fallo la invocacion: " + e.getMessage());
		}
		
		
	}

}
