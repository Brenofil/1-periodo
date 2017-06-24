package br.unirio.bsi.tp1.lista17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Exercicio2E {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Collection<String> titulofilme = new ArrayList<String>();
		Collection<String> artigoPreposicao = new ArrayList<String>();

		configuraArtigosPreposicao(artigoPreposicao);
		
		String titulo = "";
		System.out.println("Insira o título de um filme (\"sair\" para encerrar):");
		
		while(!"sair".equals((titulo = leitor.nextLine()))){
			System.out.println("Insira o título de um filme (\"sair\" para encerrar):");
			titulofilme.add(titulo);
		}
		
		if(titulofilme.size() > 0){
			for (String tituloInserido : titulofilme) {
				for (String tituloSplitado : tituloInserido.split(" ")) {
					if (artigoPreposicao.contains(tituloSplitado)) {
						System.out.print(tituloSplitado+" ");
					}else {
						System.out.print(formatadorTitulo(tituloSplitado));
					}
				}
				System.out.println(" ");
			}
		}

		leitor.close();
		System.exit(0);
	}

	private static void configuraArtigosPreposicao(Collection<String> artigoPreposicao) {
		artigoPreposicao.add("a");
		artigoPreposicao.add("de");
		artigoPreposicao.add("em");
		artigoPreposicao.add("por");
		artigoPreposicao.add("per");
		artigoPreposicao.add("o");
		artigoPreposicao.add("os");
		artigoPreposicao.add("um");
		artigoPreposicao.add("uns");
		artigoPreposicao.add("a");
		artigoPreposicao.add("as");
		artigoPreposicao.add("uma");
		artigoPreposicao.add("umas");
		artigoPreposicao.add("duma");
		artigoPreposicao.add("dumas");
		artigoPreposicao.add("numa");
		artigoPreposicao.add("numas");
		artigoPreposicao.add("dum");
		artigoPreposicao.add("duns");
		artigoPreposicao.add("num");
		artigoPreposicao.add("nuns");
		artigoPreposicao.add("à");
		artigoPreposicao.add("às");
		artigoPreposicao.add("da");
		artigoPreposicao.add("das");
		artigoPreposicao.add("na");
		artigoPreposicao.add("nas");
		artigoPreposicao.add("pela");
		artigoPreposicao.add("pelas");
		artigoPreposicao.add("ao");
		artigoPreposicao.add("aos");
		artigoPreposicao.add("do");
		artigoPreposicao.add("dos");
		artigoPreposicao.add("no");
		artigoPreposicao.add("nos");
		artigoPreposicao.add("pelo");
		artigoPreposicao.add("pelos");
		artigoPreposicao.add("até");
		artigoPreposicao.add("após");
		artigoPreposicao.add("ante");
		artigoPreposicao.add("desde");
		artigoPreposicao.add("sobre");
		artigoPreposicao.add("sob");
		artigoPreposicao.add("sem");
		artigoPreposicao.add("perante");
		artigoPreposicao.add("entre");
	}

	private static String formatadorTitulo(String tituloSplitado) {
		// TODO Auto-generated method stub
		return tituloSplitado.toUpperCase().substring(0,1)+tituloSplitado.substring(1,tituloSplitado.length())+" ";
	}

}
