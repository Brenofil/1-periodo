package br.unirio.bsi.tp1.lista17;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Exercicio2CTest {

	public Exercicio2CTest() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRemoverEspacoDuplo() {
		Exercicio2C.setRodandoPeloTestCase(true);

		String sinopseDuplos = "Maybe  some  Indie  Spirit  nominations  are  in  the  picture  too?";

		String sinopse = "Maybe some Indie Spirit nominations are in the picture too?";

		assertTrue(sinopse.equals(Exercicio2C.removeEspacoDuplo(sinopseDuplos)));;

	}

}
