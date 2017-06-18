package br.unirio.bsi.tp1.lista17;

import java.util.Scanner;

public class Exercicio2B {

	private static boolean rodandoPeloTestCase = false;

	public static void main(String[] args) {

		if (!rodandoPeloTestCase) {
			Scanner leitor = new Scanner(System.in);

			System.out.println("Insira a sinopse do filme / série:");
			String sinopse = leitor.nextLine();

			long numeroPalavras = Exercicio2B.contaPalavras(sinopse);
			System.out.println("O número de palavras é: " + numeroPalavras);

			leitor.close();
		}

	}

	public static boolean isRodandoPeloTestCase() {
		return rodandoPeloTestCase;
	}

	public static void setRodandoPeloTestCase(boolean rodandoPeloTestCase) {
		Exercicio2B.rodandoPeloTestCase = rodandoPeloTestCase;
	}

	public static long contaPalavras(String sinopse) {
		String[] palavras = sinopse.split(" ");

		return palavras.length;
	}
}
