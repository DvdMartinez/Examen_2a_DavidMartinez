package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	Fecha miTest= new Fecha();

	@Test
	void test() {
		assertFalse(miTest.validarFecha(-5,7,2004));
		
	}
	@Test
	void test1() {
		assertFalse(miTest.validarFecha(40,4,2004));
	}
	
	@Test
	void test2() {
		assertTrue(miTest.validarFecha(12,2,2004));
	}
  
	@Test
	void test3() {
		assertTrue(miTest.validarFecha(31,5,2004));
	}
	void test4() {
		assertFalse(miTest.validarFecha(30,2,2004));
	}
	  
}
