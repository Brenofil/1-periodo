package br.unirio.bsi.tp1.lista15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
			
		for (int i = 0; i < 10; i++) {
				System.out.println("Insira um número:");
				int num = leitor.nextInt();
				numeros.add(num);
			}	
	//ordem inversa
	int aux = 0;
	for (int j = 0; j < args.length; j++) {
		if (numeros.get(j-1) > numeros.get(j)) {
			aux = numeros.get(j-1);
			numeros.set(j-1, numeros.get(j));
			numeros.set(j, aux);
		}
	}
	System.out.println("Ordem crescente:");
	for (int i = 0; i < args.length; i++) {
		System.out.println(numeros.get(i));
	}
		
		leitor.close();
	}

}
