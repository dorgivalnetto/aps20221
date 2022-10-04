package br.edu.ufca.aps.revisao;

import java.util.Scanner;

public class TeoriaMetodo {
	/*
	 * public static void main(String[] args) { Scanner teclado = new
	 * Scanner(System.in);
	 * 
	 * System.out.print("Entre com a sua altura em metros: "); double altura =
	 * teclado.nextDouble();
	 * 
	 * System.out.print("Entre com a sua massa em kg: "); double massa =
	 * teclado.nextDouble();
	 * 
	 * double imc = massa / Math.pow(altura, 2); System.out.println("Seu IMC é " +
	 * imc); }
	 */
	// Definindo um método

	public static double leia(String mensagem) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(mensagem);
		return teclado.nextDouble();
	}

	public static void main(String[] args) {
		double altura = leia("Entre com a sua altura em metros: ");
		double massa = leia("Entre com a sua massa em kg: ");
		double imc = massa / Math.pow(altura, 2);
		System.out.println("Seu IMC é " + imc);
	}

	/*
	 * Sobrecarga de métodos
	 * 	Uma classe pode ter dois ou mais métodos com o mesmo nome, desde que os
	 * 	tipos de seus argumentos sejam distintos
	 * 	Isso é útil quando queremos implementar um método em função de outro
	 */
	
	
}
