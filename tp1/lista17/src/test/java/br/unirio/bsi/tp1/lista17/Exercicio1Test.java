package br.unirio.bsi.tp1.lista17;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Exercicio1Test {

	public Exercicio1Test() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testComparaPalavras() {
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
