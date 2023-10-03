package test;

 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {
	
	private int value1;
	private int value2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("set up");
		value1=5;
		value2=5;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each");
	}

	@Test
	void testSuma() {
		int expected=10;
		int actual=Calculadora.suma(value1,value2);
		assertEquals(expected,actual);
	}

	@Test
	void testResta() {
		int expected=0;
		int actual=Calculadora.resta(value1,value2);
		assertEquals(expected,actual);
	}

	@Test
	void testMultiplica() {
		int expected=25;
		int actual=Calculadora.multiplica(value1,value2);
		assertEquals(expected,actual);
	}

	@Test
	void testDivide() {
		int expected=1;
		int actual=Calculadora.divide(value1,value2);
		assertEquals(expected,actual);
	}

}
