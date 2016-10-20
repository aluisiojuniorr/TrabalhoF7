package br.com.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.UtilCalculator;

public class CalcTest {
	UtilCalculator calc = new UtilCalculator();

	
	@Test
	public void testSubtracao() {
		Assert.assertEquals(3, calc.sub(10, 7));
	}
	@Test
	public void testDivisao() {
		Assert.assertEquals(10, calc.div(1000, 100));
	}
	
	@Test
	public void testMultiplicacao() {
		Assert.assertEquals(1, calc.mult(1, 1));
	}
	@Test
	public void testSoma() {
		Assert.assertEquals(10, calc.sum(5, 5));
	}
	
	
}
