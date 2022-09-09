package br.edu.ufca.aps.exemplo2;

public class TMCalculadoraDescontos {

	public double calcular(Orcamento orcamento) {
		TMDesconto desconto = new TMDescontoMaiorQuinhentos(
				new TMDescontoMaisCincoItens(
						new TMSemDesconto()));
		
		return desconto.efetuarCalculo(orcamento);
	}
}
