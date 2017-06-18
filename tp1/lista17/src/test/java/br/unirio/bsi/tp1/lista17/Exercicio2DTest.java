package br.unirio.bsi.tp1.lista17;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Exercicio2DTest {

	public Exercicio2DTest() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Exercicio2D.setRodandoPeloTestCase(true);
		
		String nome1 = "Quentin";
		String nome2 = "Tarantino";
		
		Exercicio2D.geraIniciais(nome1,nome2);
		
		
		
	}

}
