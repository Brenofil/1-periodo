package br.unirio.bsi.tp1.lista17;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Exercicio1Test extends TestCase {

	public Exercicio1Test() {

	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(Exercicio1Test.class);
	}

	public void testPalavras() {
		
		Exercicio1.setRodandoPeloTestCase(true);

		String palavra1 = "cool";
		String palavra2 = "cooler";
		
		int caracterDiferente = Exercicio1.comparaPalavras(palavra1, palavra2);
		assertEquals(5, caracterDiferente);
		
		palavra1 = "cooler";
		palavra2 = "cool";
		caracterDiferente = Exercicio1.comparaPalavras(palavra1, palavra2);
		assertEquals(5, caracterDiferente);
		
		palavra1 = "cocô";
		palavra2 = "coco";
		caracterDiferente = Exercicio1.comparaPalavras(palavra1, palavra2);
		assertEquals(4, caracterDiferente);
		
		palavra1 = "abacaxi";
		palavra2 = "abacaxi";
		caracterDiferente = Exercicio1.comparaPalavras(palavra1, palavra2);
		assertEquals(-1, caracterDiferente);
		
		palavra1 = "roma";
		palavra2 = "amor";
		caracterDiferente = Exercicio1.comparaPalavras(palavra1, palavra2);
		assertEquals(1, caracterDiferente);		
	}
}
