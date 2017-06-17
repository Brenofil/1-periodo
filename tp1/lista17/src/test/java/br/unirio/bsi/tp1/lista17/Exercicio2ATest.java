package br.unirio.bsi.tp1.lista17;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Exercicio2ATest {

	public Exercicio2ATest() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testContaCaracteres() {
		Exercicio2A.setRodandoPeloTestCase(true);

		String sinopse = "Um dois três quatro cinco 1 . , % ( ) [ ]";

		// 21
		assertEquals(29, Exercicio2A.contaCaracteres(sinopse));
	}

	@Test
	public void testContaLetras() {
		Exercicio2A.setRodandoPeloTestCase(true);

		String sinopse = "Um dois três quatro cinco 1 . , % ( ) [ ]";

		// 21
		assertEquals(21, Exercicio2A.contaLetras(sinopse));
	}
}
