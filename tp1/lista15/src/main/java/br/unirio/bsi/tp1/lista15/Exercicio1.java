package br.unirio.bsi.tp1.lista15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//criação array list
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println("Insira o número desejado de números:");
        int n = entrada.nextInt();
        int i = 0;
        
        //acquisição dos numeros pro array 
        while (i < n) {
			System.out.println("Insira o número desejado:");
			numeros.add(entrada.nextInt());
			i++;
        }
        //contagem contrária
        for (int j = n-1; j <= n && j >= 0; j--) {
			System.out.println(numeros.get(j));
		}
		entrada.close();
	}

}
