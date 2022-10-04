package br.edu.ufca.aps.revisao;

import java.util.Scanner;

public class AtividadePratica03 {

	/*
	 * Considere os programas a seguir, que leem um 
	 * c�digo repetidamente e imprimem o c�digo lido
	 * at� que o c�digo lido seja igual a -1.
	 * O c�digo -1 n�o deve ser impresso. 
	 * 	a. Qual das duas solu��es � a correta?
	 * 	b. Como a solu��o incorreta poderia ser corrigida?
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo;
		System.out.println("Informe o c�digo: ");
		codigo = teclado.nextInt();
		while (codigo != -1) {
			System.out.println("C�digo: " + codigo);
			System.out.println("Informe o c�digo: ");
			codigo = teclado.nextInt();
		}

		do {
			System.out.print("Informe o c�digo: ");
			codigo = teclado.nextInt();
			System.out.println("C�digo: " + codigo);
		} while (codigo != -1);
	}
}

