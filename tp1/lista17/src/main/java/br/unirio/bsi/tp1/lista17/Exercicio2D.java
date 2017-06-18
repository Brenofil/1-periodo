package br.unirio.bsi.tp1.lista17;

import java.util.Scanner;

public class Exercicio2D {

	private static boolean rodandoPeloTestCase = false;

	public static void main(String[] args) {
		if (!rodandoPeloTestCase) {
			Scanner leitor = new Scanner(System.in);

			System.out.println("Insira o nome do diretor:");
			String nomeDiretor = leitor.next();
			String sobrenomeDiretor = leitor.next();
			
			System.out.println(geraIniciais(nomeDiretor, sobrenomeDiretor));
			
			/*for (String string : nomeDiretor.split(" ")) {
				System.out.print(string.charAt(0) + ".");
			}
			for (String string : sobrenomeDiretor.split(" ")) {
				System.out.print(string.charAt(0));
			}*/

			leitor.close();
		}

	}

	public static StringBuilder geraIniciais(String nomeDiretor, String sobrenomeDiretor) {
		StringBuilder iniciais = new StringBuilder();
		
		for (String string : nomeDiretor.split(" ")) {
			iniciais.append(string.charAt(0));
		}
		iniciais.append(".");
		for (String string : sobrenomeDiretor.split(" ")) {
			iniciais.append(string.charAt(0));
		}
		
		
		return iniciais;
	}

	public static boolean isRodandoPeloTestCase() {
		return rodandoPeloTestCase;
	}

	public static void setRodandoPeloTestCase(boolean rodandoPeloTestCase) {
		Exercicio2C.rodandoPeloTestCase = rodandoPeloTestCase;
	}

}
