package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Relacion.Biblioteca;

class BibliotecaTest {

	Biblioteca biblioteca = new Biblioteca();
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSolicitudDeLibro() {
		try {
			biblioteca.solicitudDeLibro();
			assertTrue(true);
		} catch (Exception e) {
			fail("Fallo la invocacion: " + e.getMessage());
		}
	}

}
