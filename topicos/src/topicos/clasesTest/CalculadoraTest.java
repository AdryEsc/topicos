package topicos.clasesTest;

import topicos.Calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora c;

	@Before
	public void inicio() {
		c = new Calculadora();
	}
	
	@Test
	public void testSuma() {
		assertEquals("7 + 6",13.0,c.suma(7, 6),.001);
	}
	
	@Test
	public void testResta() {
		assertEquals("7 - 6",1,c.resta(7, 6),.001);
	}
	
	@Test()
	public void testMultiplica() {
		assertEquals("7 * 6",42,c.multiplica(7, 6),.001);
	}
	

}
