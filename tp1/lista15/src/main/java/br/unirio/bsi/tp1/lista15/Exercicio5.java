package br.unirio.bsi.tp1.lista15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<Integer>(15);
		for (int i = 0; i < 3; i++) {
			System.out.println("Insira um número para inserir na coleção:");
			numeros.add(leitor.nextInt());
		}
		System.out.println("Insira o número que deseja obter da coleção inserida:");
		int escolhaNumero = leitor.nextInt();

		boolean achou = false;
		int index = -1;

		for (int i = 0; i < 3; i++) {
			if (numeros.get(i) == escolhaNumero) {
				achou = true;
				index = i;
			}
		}

		if (achou) {
			System.out.println("O número escolhido " + escolhaNumero + " se encontra na coleção na posição " + (index+1));
		} else {
			System.out.println("O número não se encontra na coleção.");
		}

		leitor.close();
	}

}
