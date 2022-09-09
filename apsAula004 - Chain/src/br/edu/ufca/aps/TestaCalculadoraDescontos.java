package br.edu.ufca.aps;

import java.math.BigDecimal;

public class TestaCalculadoraDescontos {

	public static void main(String[] args) {
		CalculadoraDescontos calculadora = new CalculadoraDescontos();
		
		Orcamento orcamento1 = new Orcamento(200, 6);
		System.out.println(calculadora.calcularDesconto(orcamento1));
		
		Orcamento orcamento2 = new Orcamento(200, 4);
		System.out.println(calculadora.calcularDesconto(orcamento2));
		
		Orcamento orcamento3 = new Orcamento(1000, 1);
		System.out.println(calculadora.calcularDesconto(orcamento3));
	}
}
