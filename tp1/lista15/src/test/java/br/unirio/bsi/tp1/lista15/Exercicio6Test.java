package br.unirio.bsi.tp1.lista15;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Exercicio6Test extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public Exercicio6Test(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(Exercicio6Test.class);
	}

	public void testaNumerosEspeciais() {

		Exercicio6.setRodandoPeloTestCase(true);

		String numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("0");

		assertTrue("zero".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("10");

		assertTrue("dez".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("100");

		assertTrue("cem".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("1000");

		assertTrue("mil".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("10000");

		assertTrue("dez mil".equals(numeroPorExtenso));

	}

	public void testaDezenas() {

		Exercicio6.setRodandoPeloTestCase(true);

		String numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("11");
		assertTrue("onze".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("12");
		assertTrue("doze".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("13");
		assertTrue("treze".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("14");
		assertTrue("quatorze".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("15");
		assertTrue("quinze".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("16");
		assertTrue("dezesseis".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("17");
		assertTrue("dezessete".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("18");
		assertTrue("dezoito".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("19");
		assertTrue("dezenove".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("20");
		assertTrue("vinte".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("21");
		assertTrue("vinte e um".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("32");
		assertTrue("trinta e dois".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("43");
		assertTrue("quarenta e três".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("54");
		assertTrue("cinquenta e quatro".equals(numeroPorExtenso));

	}

	public void testaCentenas() {

		Exercicio6.setRodandoPeloTestCase(true);

		String numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("101");
		assertTrue("cento e um".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("102");
		assertTrue("cento e dois".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("109");
		assertTrue("cento e nove".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("110");
		assertTrue("cento e dez".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("200");
		assertTrue("duzentos".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("300");
		assertTrue("trezentos".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("400");
		assertTrue("quatrocentos".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("500");
		assertTrue("quinhentos".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("600");
		assertTrue("seiscentos".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("700");
		assertTrue("setecentos".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("800");
		assertTrue("oitocentos".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("900");
		assertTrue("novecentos".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("111");
		assertTrue("cento e onze".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("221");
		assertTrue("duzentos e vinte e um".equals(numeroPorExtenso));

	}

	public void testaMilhar() {

		Exercicio6.setRodandoPeloTestCase(true);

		String numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("1001");
		assertTrue("mil e um".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("1010");
		assertTrue("mil e dez".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("1011");
		assertTrue("mil e onze".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("1020");
		assertTrue("mil e vinte".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("1090");
		assertTrue("mil e noventa".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("1100");
		assertTrue("mil e cem".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("1199");
		assertTrue("mil cento e noventa e nove".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("1999");
		assertTrue("mil novecentos e noventa e nove".equals(numeroPorExtenso));

	}

	public void testaDezenaMilhar() {

		Exercicio6.setRodandoPeloTestCase(true);

		String numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("10000");
		assertTrue("dez mil".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("10001");
		assertTrue("dez mil e um".equals(numeroPorExtenso));
		
		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("10010");
		assertTrue("dez mil e dez".equals(numeroPorExtenso));
		
		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("10100");
		assertTrue("dez mil e cem".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("10897");
		assertTrue("dez mil oitocentos e noventa e sete".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("10010");
		assertTrue("dez mil e dez".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("11000");
		assertTrue("onze mil".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("15385");
		assertTrue("quinze mil trezentos e oitenta e cinco".equals(numeroPorExtenso));

		numeroPorExtenso = Exercicio6.escreveNumeroPorExtenso("40000");
		assertTrue("quarenta mil".equals(numeroPorExtenso));

	}
}
