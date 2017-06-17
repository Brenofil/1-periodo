package br.unirio.bsi.tp1.lista15;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		String[] gabarito = new String[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Insira a resposta da questão " + (i + 1));
			gabarito[i] = leitor.next();
		}

		System.out.println("Insira o número de alunos:");
		int numeroAlunos = leitor.nextInt();

		int nota = 0;
		for (int i = 0; i < numeroAlunos; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("Insira a resposta para a questão " + (j + 1) + " do aluno " + (i + 1));
				String resposta = leitor.next();
				if (resposta.equals(gabarito[j])) {
					nota++;
				}
			}
			System.out.println("Nota do aluno "+(i+1)+": "+nota);

		}
		leitor.close();
	}

}
