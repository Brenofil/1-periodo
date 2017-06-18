package br.unirio.bsi.tp1.lista17;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Exercicio2BTest {

	public Exercicio2BTest() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testContaPalavras() {
		Exercicio2B.setRodandoPeloTestCase(true);
		String sinopse = "um dois tres quatro";
		assertEquals(4, Exercicio2B.contaPalavras(sinopse));

		sinopse = "Wuba luba duba duba, koe rapaziada!";
		assertEquals(6, Exercicio2B.contaPalavras(sinopse));
	}

}
