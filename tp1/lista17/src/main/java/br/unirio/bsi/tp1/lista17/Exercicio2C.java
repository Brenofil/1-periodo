package br.unirio.bsi.tp1.lista17;

import java.util.Scanner;

public class Exercicio2C {

	static boolean rodandoPeloTestCase = false;

	public static void main(String[] args) {

		if (!rodandoPeloTestCase) {
			Scanner leitor = new Scanner(System.in);

			System.out.println("Insira a sinopse do filme / série:");
			String sinopse = leitor.nextLine();
			
			System.out.println("A sinopse sem espaços duplos: "+removeEspacoDuplo(sinopse));
			
			leitor.close();
		}
	}

	public static boolean isRodandoPeloTestCase() {
		return rodandoPeloTestCase;
	}

	public static void setRodandoPeloTestCase(boolean rodandoPeloTestCase) {
		Exercicio2C.rodandoPeloTestCase = rodandoPeloTestCase;
	}

	public static String removeEspacoDuplo(String sinopse) {
		String sinopseSemEspacoDuplo = sinopse.replaceAll("  ", " ");

		return sinopseSemEspacoDuplo;
	}

}
