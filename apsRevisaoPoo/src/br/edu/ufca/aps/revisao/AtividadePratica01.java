package br.edu.ufca.aps.revisao;

import java.util.Scanner;

public class AtividadePratica01 {

	/* Dado que a dist�ncia entre dois pontos A(3,5) e B(6,1) � 5.
	 * O programa a seguirestranhamente sempre escreve 
	 * �A distancia e: 1.0�. Identifique onde est� o 
	 * defeito.
	 * 
	 * Dados os pontos A(xA, yA) e B (xB, Yb), para 
	 * calcular a dist�ncia entre esses dois pontos, 
	 * utilizamos a f�rmula 
	 * dAB� = (xB � xA)� + (yB � yA)�.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x1, y1, x2, y2, distancia;
		System.out.println("Entre com as coordenadas x"
				+ " e y de dois pontos nesta ordem:");
		x1 = teclado.nextFloat();
		y1 = teclado.nextFloat();
		x2 = teclado.nextFloat();
		y2 = teclado.nextFloat();
		distancia = Math.sqrt(Math.pow(x2 - x1, 2) +
				Math.pow(y2 - y1, 2));		
		System.out.println("A dist�ncia �: " + distancia);
	}
}
