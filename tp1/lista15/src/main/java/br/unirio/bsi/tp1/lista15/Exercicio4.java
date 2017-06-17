package br.unirio.bsi.tp1.lista15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ArrayList <Integer> idades = new ArrayList <Integer>();
		ArrayList <Double> alturas = new ArrayList <Double>();
		
		int totalIdade = 0;
		double totalAltura = 0;
		
		for (int i = 0; i < 30; i++) {
			System.out.println("Insira a idade do aluno");
			idades.add (leitor.nextInt());
			System.out.println("Insira a altura do aluno");
			alturas.add (leitor.nextDouble());
		}
		for (int i = 0; i < 30; i++) {
			totalIdade += idades.get(i);
			totalAltura += alturas.get(i);
		}
		
		int mediaIdade = (totalIdade/6);
		double mediaAltura = (totalAltura/6);
		int alunosMediaAltura = 0;
		int alunosMediaIdade = 0;
		
		for (int i = 0; i < 30; i++) {
			if (alturas.get(i) == mediaAltura) {
			 alunosMediaAltura++;	
			}
			if (idades.get(i) == mediaIdade) {
			 alunosMediaIdade++;
			}
		}
		
		System.out.println("Número de alunos com a altura na média é: "+ alunosMediaAltura);
		System.out.println("Número de alunos com a idade na média é: "+ alunosMediaIdade);
		
		
		
		
		leitor.close();
	}

}
