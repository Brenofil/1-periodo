package br.unirio.bsi.tp1.lista17;

import java.util.Scanner;

public class Exercicio2A {

	private static boolean rodandoPeloTestCase = false;

	public static void main(String[] args) {

		if (!rodandoPeloTestCase) {
			Scanner leitor = new Scanner(System.in);

			System.out.println("Insira a sinopse do filme / série:");
			String sinopse = leitor.nextLine();
			
			long nroCaracteres = Exercicio2A.contaCaracteres(sinopse);
			System.out.println("O número de caracteres (todos) é: " + nroCaracteres);
			
			long nroLetras = Exercicio2A.contaLetras(sinopse);
			System.out.println("O número de letras é: " + nroLetras);

			leitor.close();
		}
	}

	public static boolean isRodandoPeloTestCase() {
		return rodandoPeloTestCase;
	}

	public static void setRodandoPeloTestCase(boolean rodandoPeloTestCase) {
		Exercicio2A.rodandoPeloTestCase = rodandoPeloTestCase;
	}

	public static long contaCaracteres(String sinopse) {
		
		long count = sinopse.replaceAll(" ", "").chars().count();
		
		return count;
	}
	
	public static long contaLetras(String sinopse) {
		long nroLetras = 0;
		
		for (char caracter : sinopse.toCharArray()) {
			if(Character.isLetter(caracter)){
				nroLetras++;
			}
		}
		
		return nroLetras;
	}
	
	
}
