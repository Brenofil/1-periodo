package br.unirio.bsi.tp1.lista17;

import java.util.Scanner;

public class Exercicio1 {

	private static boolean rodandoPeloTestCase = false;

	public static void main(String[] args) {

		if (!rodandoPeloTestCase) {
			Scanner leitor = new Scanner(System.in);

			System.out.println("Insira uma palavra:");
			String palavra1 = leitor.nextLine();
			System.out.println("Insira outra palavra:");
			String palavra2 = leitor.nextLine();

			int posicaoDiferente = comparaPalavras(palavra1, palavra2);

			if (posicaoDiferente != -1) {
				System.out.println("As palavras se diferem no caracter numero: " + posicaoDiferente);
			}

			leitor.close();
		}
	}

	protected static int comparaPalavras(String palavra1, String palavra2) {
		int caracterDiferente = -1;
		int menorPalavra = palavra2.length();

		if (palavra1.length() <= palavra2.length()) {
			menorPalavra = palavra1.length();
		}

		for (int i = 0; i < menorPalavra; i++) {
			if (palavra1.charAt(i) != palavra2.charAt(i)) {
				caracterDiferente = i + 1;
				break;
			}
		}

		if (caracterDiferente == -1 && palavra1.length() != palavra2.length()) {
			caracterDiferente = menorPalavra + 1;
		}

		return caracterDiferente;
	}

	public static boolean isRodandoPeloTestCase() {
		return rodandoPeloTestCase;
	}

	public static void setRodandoPeloTestCase(boolean rodandoPeloTestCase) {
		Exercicio1.rodandoPeloTestCase = rodandoPeloTestCase;
	}

}
