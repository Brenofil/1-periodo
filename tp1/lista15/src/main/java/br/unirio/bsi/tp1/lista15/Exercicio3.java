package br.unirio.bsi.tp1.lista15;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int face1 = 0;
		int face2 = 0;
		int face3 = 0;
		int face4 = 0;
		int face5 = 0;
		int face6 = 0;
		int numeroFace = 2;

		while (numeroFace > 0) {
			System.out.println("Insira o valor da face obtida no dado ou 0 para cessar o programa:");
			numeroFace = leitor.nextInt();
			if (numeroFace == 1) {
				face1 += 1;
			}
			if (numeroFace == 2) {
				face2 += 1;
			}
			if (numeroFace == 3) {
				face3 += 1;
			}
			if (numeroFace == 4) {
				face4 += 1;
			}
			if (numeroFace == 5) {
				face5 += 1;
			}
			if (numeroFace == 6) {
				face6 += 1;
			}
		}
		System.out.println("O numero de vezes que a face 1 foi obtida:" + face1);
		System.out.println("O numero de vezes que a face 1 foi obtida:" + face2);
		System.out.println("O numero de vezes que a face 1 foi obtida:" + face3);
		System.out.println("O numero de vezes que a face 1 foi obtida:" + face4);
		System.out.println("O numero de vezes que a face 1 foi obtida:" + face5);
		System.out.println("O numero de vezes que a face 1 foi obtida:" + face6);

		leitor.close();
	}

}
