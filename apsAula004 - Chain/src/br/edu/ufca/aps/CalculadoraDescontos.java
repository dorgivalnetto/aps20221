package br.edu.ufca.aps;

import java.math.BigDecimal;

public class CalculadoraDescontos {

	public double calcularDesconto(Orcamento orcamento) {
		
		if(orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor()*0.10;
		} 
		if (orcamento.getValor() > 500) {
			return orcamento.getValor()*0.05;
		}
		return 0;
	}
}
