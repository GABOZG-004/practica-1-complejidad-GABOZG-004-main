/**
 * Código utilizado para el curso de Estructuras de Datos.
 */
package ed.complejidad;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import ed.Calificador;

/**
 * Pruebas unitarias para los ejercicios de cálculo de complejidad.
 *
 * @author blackzafiro
 */
public class ComplejidadTest extends Calificador {

	protected IComplejidad c;

	@Override
	public void init() {
		c = new Complejidad();
	}

	/**
	 * Test of tPascalRec method, of class Complejidad.
	 */
	@Test
	public void testTPascalRec() {
		startTest("tPascalRec", 2.0);
		assertEquals(10, c.tPascalRec(5, 2));
		addUp(1.0);
		assertEquals(3, c.tPascalRec(3, 2));
		addUp(1.0);
		passed();
	}

	/**
	 * Test of tPascalIt method, of class Complejidad.
	 */
	@Test
	public void testTPascalIt() {
		startTest("tPascalIt", 2.0);
		assertEquals(10, c.tPascalIt(5, 2));
		addUp(1.0);
		assertEquals(3, c.tPascalIt(3, 2));
		addUp(1.0);
		passed();
	}

	/**
	 * Test of fibonacciRec method, of class Complejidad.
	 */
	@Test
	public void testFibonacciRec() {
		startTest("fibonacciRec", 2.0);
		assertEquals(8, c.fibonacciRec(6));
		addUp(1.0);
		assertEquals(21, c.fibonacciRec(8));
		addUp(1.0);
		passed();
	}

	/**
	 * Test of fibonacciIt method, of class Complejidad.
	 */
	@Test
	public void testFibonacciIt() {
		startTest("fibonacciIt", 2.0);
		assertEquals(21, c.fibonacciIt(8));
		addUp(1.0);
		assertEquals(144, c.fibonacciIt(12));
		addUp(1.0);
		passed();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testFibItInválido() {
		startTest("Cálculo Fibonacci valor inválido iterativo", 0.2);
		try {
			c.fibonacciIt(-5);
		} catch (IndexOutOfBoundsException e) {
			addUp(0.2);
			passed();
			throw e;
		}
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testFibRecInválido() {
		startTest("Cálculo Fibonacci valor inválido recursivo", 0.2);
		try {
			c.fibonacciRec(-10);
		} catch (IndexOutOfBoundsException e) {
			addUp(0.2);
			passed();
			throw e;
		}
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testPascalInválido() {
		startTest("Cálculo Pascal valor inválido iterativo", 0.2);
		try {
			c.tPascalIt(-5, 1);
		} catch (IndexOutOfBoundsException e) {
			addUp(0.2);
			passed();
			throw e;
		}
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testPascalInválido2() {
		startTest("Cálculo Pascal valor inválido iterativo 2", 0.2);
		try {
			c.tPascalIt(5, -1);
		} catch (IndexOutOfBoundsException e) {
			addUp(0.2);
			passed();
			throw e;
		}
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testPascalInválido3() {
		startTest("Cálculo Pascal valor inválido iterativo 3", 0.2);
		try {
			c.tPascalIt(3, 5);
		} catch (IndexOutOfBoundsException e) {
			addUp(0.2);
			passed();
			throw e;
		}
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testPascalRecInválido() {
		startTest("Cálculo pascal valor inválido recursivo", 0.2);
		try {
			c.tPascalRec(-5, 1);
		} catch (IndexOutOfBoundsException e) {
			addUp(0.2);
			passed();
			throw e;
		}
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testPascalRecInválido2() {
		startTest("Cálculo Pascal valor inválido recursivo 2", 0.2);
		try {
			c.tPascalRec(5, -1);
		} catch (IndexOutOfBoundsException e) {
			addUp(0.2);
			passed();
			throw e;
		}
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testPascalRecInválido3() {
		startTest("Cálculo Pascal valor inválido recursivo 3", 0.2);
		try {
			c.tPascalRec(3, -5);
		} catch (IndexOutOfBoundsException e) {
			addUp(0.2);
			passed();
			throw e;
		}
	}

	//Mis test de mis cuatro métodos

	@Test(expected = IndexOutOfBoundsException.class)
    public void testPascalRec() {
        startTest("Cálculo Pascal recursivo inválido 4", 0.2);
        try{
			c.tPascalRec(-8, -2);
		} catch(IndexOutOfBoundsException e){
			addUp(0.2);
			passed();
			throw e;
		}
    }

	@Test
	public void testPascalIt(){
		startTest("Pascal Iterativo", 2.0);
		assertEquals(15, c.tPascalIt(6, 2));
		addUp(1.0);
		assertEquals(6, c.tPascalIt(4, 2));
		addUp(1.0);
		passed();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testTFibonacciRec(){
		startTest("Cálculo Fibonacci recursivo inválido 2", 0.2);
		try{
			c.fibonacciRec(-8);
		} catch(IndexOutOfBoundsException e){
			addUp(0.2);
			passed();
			throw e;
		}
	}

	@Test
	public void testTFibonacciIt(){
		startTest("Fibonacci Iterativo", 2.0);
		assertEquals(610, c.fibonacciIt(15));
		addUp(1.0);
		assertEquals(55, c.fibonacciIt(10));
		addUp(1.0);
		passed();
	}

	//@Test
    //public void testPascalIt() {
        
    //}
	/*
	@Test
	public void  testCalcularFibonacciRecusrsivo(){
		int numeroFibonacci = 10;
		int resultadoEsperado  = 55;
		assertEquals(resultadoEsperado, ComplejidadTest.calcularFibonacciRecusrsivo(numeroFibonacci));
	}

	@Test
	public void testCalcularFibonacciIterativo(){
		int numeroFibonacci = 10;
		int resultadoEsperado = 55;
		assertEquals(resultadoEsperado, ComplejidadTest.calcularFibonacciIterativo(numeroFibonacci));
	}

	@Test
	public void testCalcularPascalRecursivo(){
		int nPascal = 5;
		int kPascal = 2;
		int resultadoEsperado = 10;
		assertEquals(resultadoEsperado, ComplejidadTest.calcularPascalRecusrsivo(nPascal, kPascal));
	}

	@Test
	public void testCalcularPascalIterativo(){
		int nPascal = 5;
		int kPascal = 2;
		int resultadoEsperado = 10;
		assertEquals(resultadoEsperado, ComplejidadTest.calcularPascalIterativo(nPascal, kPascal));
	}
	*/
}
