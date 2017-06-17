package br.unirio.bsi.tp1.lista15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Exercicio6 {

	private static Collection<String> unidades = new ArrayList<String>();
	private static Collection<String> dezenas = new ArrayList<String>();
	private static Collection<String> centenas = new ArrayList<String>();
	private static Collection<String> milhares = new ArrayList<String>();
	private static boolean rodandoPeloTestCase = false;

	public static void main(String[] args) {

		if (!isRodandoPeloTestCase()) {

			Scanner leitor = new Scanner(System.in);

			System.out.println("Escreva um número de 0 a 99.999.");

			String numeroUsuario = leitor.next();

			System.out.println(escreveNumeroPorExtenso(numeroUsuario));

			leitor.close();
		}

	}

	private static boolean validaNumero(String numeroUsuario) {

		try {
			Integer.valueOf(numeroUsuario);
			return true;

		} catch (NumberFormatException e) {
			return false;
		}

	}

	static String escreveNumeroPorExtenso(String numero) {

		String numeroPorExtenso = "";

		boolean isNumeroValido = validaNumero(numero);

		if (isNumeroValido) {

			boolean isNumeroEspecial = verificaNumeroEspecial(numero);

			if (isNumeroEspecial) {
				numeroPorExtenso = processaNumerosEspeciais(Integer.valueOf(numero));
			} else {
				numeroPorExtenso = processaNumero(numero);
			}
		} else {
			numeroPorExtenso = "Não foi informado um número válido";
		}

		return numeroPorExtenso;
	}

	private static String processaNumero(String numero) {

		String numeroPorExtenso = "";
		int casasNumericas = numero.length();

		switch (casasNumericas) {
		case 1:
			numeroPorExtenso = processaUnidade(Integer.valueOf(numero));
			break;
		case 2:
			numeroPorExtenso = processaDezena(Integer.valueOf(numero));
			break;
		case 3:
			numeroPorExtenso = processaCentena(Integer.valueOf(numero));
			break;
		case 4:
			numeroPorExtenso = processaMilhar(Integer.valueOf(numero));
			break;
		case 5:
			numeroPorExtenso = processaDezenaMilhar(Integer.valueOf(numero));
			break;

		default:
			break;
		}

		return numeroPorExtenso;
	}

	private static String processaMilhar(Integer numero) {

		String numeroFormatado = "";
		String milhar = String.valueOf(numero);
		Integer primeiroDigito = Integer.valueOf(milhar.substring(0, 1));

		if (numero == 1000) {
			numeroFormatado = ((ArrayList<String>) milhares).get(0);

		} else if (numero > 1000 && numero < 1010) {

			numeroFormatado = ((ArrayList<String>) milhares).get(0) + " e " + processaUnidade(numero - 1000);

		} else if (numero >= 1010 && numero < 1099) {

			numeroFormatado = ((ArrayList<String>) milhares).get(0) + " e " + processaDezena(numero - 1000);

		} else if (numero > 1100 && numero < 2000) {
			numeroFormatado = ((ArrayList<String>) milhares).get(0) + " " + processaCentena(numero - 1000 * primeiroDigito);

		} else if (numero % 1000 == 0) {
			numeroFormatado = processaUnidade(primeiroDigito) + ((ArrayList<String>) milhares).get(0);

		} else if (numero % 1000 != 0) {

			numeroFormatado = escreveMilhares(numero);
		}

		return numeroFormatado;
	}

	private static String processaDezenaMilhar(Integer numero) {

		String numeroFormatado = "";
		String dezenaMilhar = String.valueOf(numero);
		Integer primeirosDigitos = Integer.valueOf(dezenaMilhar.substring(0, 2));
		Integer ultimoDigito = Integer.valueOf(dezenaMilhar.substring(4, 5));

		if (numero == 10000) {
			numeroFormatado = processaDezena(primeirosDigitos) + " " + ((ArrayList<String>) milhares).get(0);

		} else if (numero > 10000 && numero < 10010) {

			numeroFormatado = processaDezena(primeirosDigitos) + " " + ((ArrayList<String>) milhares).get(0) + " e " + processaUnidade(ultimoDigito);

		} else if (numero >= 10010 && numero < 10100) {

			numeroFormatado = processaDezena(primeirosDigitos) + " " + ((ArrayList<String>) milhares).get(0) + " e " + processaDezena(numero - 10000);

		} else if (numero > 10100 && numero < 10999) {
			numeroFormatado = processaDezena(primeirosDigitos) + " " + ((ArrayList<String>) milhares).get(0) + " " + processaCentena(numero - 10000);

		} else if (numero % 1000 == 0) {
			numeroFormatado = processaDezena(primeirosDigitos) + " " + ((ArrayList<String>) milhares).get(0);

		} else if (numero % 10000 != 0) {
			numeroFormatado = escreveDezenaMilhar(numero);
		}

		return numeroFormatado;
	}

	private static String escreveDezenaMilhar(Integer numero) {
		String dezenaMilhar = String.valueOf(numero);
		Integer primeirosDigitos = Integer.valueOf(dezenaMilhar.substring(0, 2));

		StringBuilder retorno = new StringBuilder();

		retorno.append(processaDezena(primeirosDigitos));
		
		retorno.append(" ").append(((ArrayList<String>) milhares).get(0));
		
		if (numero % 100 == 0) {
			retorno.append(" e ");
		} else {
			retorno.append(" ");
		}
		
		retorno.append(processaCentena(numero - 1000 * primeirosDigitos));

		return retorno.toString();
	}

	private static String escreveMilhares(Integer numero) {

		String milhar = String.valueOf(numero);
		Integer primeiroDigito = Integer.valueOf(milhar.substring(0, 1));

		StringBuilder retorno = new StringBuilder();

		retorno.append(((ArrayList<String>) milhares).get(0));
		if (numero % 100 == 0) {
			retorno.append(" e ");
		}
		retorno.append(processaCentena(numero - 1000 * primeiroDigito));

		return retorno.toString();
	}

	private static String processaCentena(Integer numero) {
		String numeroFormatado = "";

		if (numero == 100) {
			numeroFormatado = ((ArrayList<String>) centenas).get(0);

		} else if (numero > 100 && numero < 110) {
			numeroFormatado = ((ArrayList<String>) centenas).get(1) + " e " + processaUnidade(numero - 100);

		} else if (numero % 100 == 0) {
			numeroFormatado = ((ArrayList<String>) centenas).get(Integer.valueOf((numero / 100)));

		} else if (numero % 100 != 0) {

			numeroFormatado = escreveCentenas(numero);
		}

		return numeroFormatado;
	}

	private static String escreveCentenas(Integer numero) {

		String centena = String.valueOf(numero);
		Integer primeiroDigito = Integer.valueOf(centena.substring(0, 1));

		StringBuilder retorno = new StringBuilder();

		retorno.append(((ArrayList<String>) centenas).get(primeiroDigito));
		retorno.append(" e ");
		retorno.append(processaDezena(numero - 100 * primeiroDigito));

		return retorno.toString();
	}

	private static String processaDezena(Integer numero) {
		String numeroFormatado = "";

		if (numero == 10) {
			numeroFormatado = ((ArrayList<String>) dezenas).get(0);
		} else if (numero < 20) {
			// tira 10 unidades para retornar ao indice 1, 2, 3, 4, 5, 6, 7, 8 e 9
			numeroFormatado = ((ArrayList<String>) dezenas).get(Integer.valueOf(numero - 10));
		} else if (numero % 10 == 0) {
			// soma 8 unidades no resto da divisao para retornar ao indice 10, 11, 12, 13, 14, 15, 16, 17
			numeroFormatado = ((ArrayList<String>) dezenas).get(Integer.valueOf((numero / 10) + 8));
		} else if (numero % 10 != 0) {

			numeroFormatado = escreveDezenas(numero);
		}

		return numeroFormatado;
	}

	private static String escreveDezenas(Integer numero) {

		return ((ArrayList<String>) dezenas).get(Integer.valueOf((numero / 10) + 8)) + " e " + ((ArrayList<String>) unidades).get(numero % 10);

	}

	private static String processaUnidade(Integer numero) {

		return ((ArrayList<String>) unidades).get(Integer.valueOf(numero));
	}

	private static String processaNumerosEspeciais(Integer numero) {

		//System.out.println("numero = [" + numero + "]");
		String retorno = "";

		switch (numero) {
		case 0:
			retorno = "zero";
			break;
		case 10:
			retorno = "dez";
			break;
		case 100:
			retorno = "cem";
			break;
		case 1000:
			retorno = "mil";
			break;
		case 10000:
			retorno = "dez mil";
			break;
		default:
			break;
		}

		return retorno;

	}

	private static boolean verificaNumeroEspecial(String numero) {

		boolean isEspecial = Integer.valueOf(numero) == 0 || Integer.valueOf(numero) == 10 || Integer.valueOf(numero) == 100 || Integer.valueOf(numero) == 1000 || Integer.valueOf(numero) == 10000;

		return isEspecial;
	}

	private static void inicializaNumerosPorExtenso() {

		unidades.add("zero");
		unidades.add("um");
		unidades.add("dois");
		unidades.add("três");
		unidades.add("quatro");
		unidades.add("cinco");
		unidades.add("seis");
		unidades.add("sete");
		unidades.add("oito");
		unidades.add("nove");

		dezenas.add("dez"); // 0
		dezenas.add("onze"); // 1
		dezenas.add("doze"); // 2
		dezenas.add("treze"); // 3
		dezenas.add("quatorze"); // 4
		dezenas.add("quinze"); // 5
		dezenas.add("dezesseis"); // 6
		dezenas.add("dezessete"); // 7
		dezenas.add("dezoito"); // 8
		dezenas.add("dezenove"); // 9
		dezenas.add("vinte"); // 10
		dezenas.add("trinta"); // 11
		dezenas.add("quarenta"); // 12
		dezenas.add("cinquenta"); // 13
		dezenas.add("sessenta"); // 14
		dezenas.add("setenta"); // 15
		dezenas.add("oitenta"); // 16
		dezenas.add("noventa"); // 17

		centenas.add("cem"); // 0
		centenas.add("cento"); // 1
		centenas.add("duzentos"); // 2
		centenas.add("trezentos"); // 3
		centenas.add("quatrocentos"); // 4
		centenas.add("quinhentos"); // 5
		centenas.add("seiscentos"); // 6
		centenas.add("setecentos"); // 7
		centenas.add("oitocentos"); // 8
		centenas.add("novecentos"); // 9

		milhares.add("mil");

	}

	public static boolean isRodandoPeloTestCase() {
		return rodandoPeloTestCase;
	}

	public static void setRodandoPeloTestCase(boolean rodandoPeloTestCase) {
		Exercicio6.rodandoPeloTestCase = rodandoPeloTestCase;
	}

	static {
		inicializaNumerosPorExtenso();
	}

}
