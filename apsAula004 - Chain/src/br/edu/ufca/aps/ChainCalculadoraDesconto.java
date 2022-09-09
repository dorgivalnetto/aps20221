package br.edu.ufca.aps;

import br.edu.ufca.aps.Orcamento;

public class ChainCalculadoraDesconto {

	public double calcular(Orcamento orcamento) {	
		/*
		 * Como o construtor exige, devemos passar a próxima regra
		 * de desconto a ser verificada
		 */
		
		ChainDesconto cadeiaDesconto = new ChainDescontoMaisCincoItens(
				new ChainDescontoMaiorQuinhentos(
						new ChainSemDesconto()));
		
		return cadeiaDesconto.calcularDesconto(orcamento);
		
		
		
		
		//ChainDesconto cadeiaDesconto = new ChainDescontoMaisCincoItens().calcular(orcamento);
		//desconto não foi aplicado
		//if (cadeiaDesconto == 0) {
		//	cadeiaDesconto = new ChainDescontoMaiorQuinhentos().calcular(orcamento);
		//}
		//return 0;
	
		
		
	}
}
