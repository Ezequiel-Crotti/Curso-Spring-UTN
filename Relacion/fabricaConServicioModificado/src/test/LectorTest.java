package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fabrica.Lector;
import fabrica.Socio;
import fabrica.publicoEnGeneral;

public class LectorTest {

	private Socio socio;
	private publicoEnGeneral publicoEnGeneral;
	
	@Before
	public void setUp() throws Exception {
		socio = new Socio();
		publicoEnGeneral = new publicoEnGeneral();
	}

	@After
	public void tearDown() throws Exception {
		socio = null;
		publicoEnGeneral = null;
	}

	@Test
	public void test() {
		if (!(socio instanceof Lector)) 
			fail("La clase Sicio no implementa la interface Lector");
		if(!(publicoEnGeneral instanceof Lector))
			fail("La clase publicoEnGeneral no implemtenta la interface Lector");
		assertTrue(true);
	}

}
