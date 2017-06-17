package br.unirio.bsi.tp1.lista15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		ArrayList<Integer> colecao = new ArrayList<Integer>(10);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Insira um número para sua coleção:");
			colecao.add(leitor.nextInt());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Posição: "+ (i+1));
			System.out.println("Valor: "+ colecao.get(i));
		}

		leitor.close();
	}

}
