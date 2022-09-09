package br.edu.ufca.aps;

public class ChainDescontoMaiorQuinhentos extends ChainDesconto {

	public ChainDescontoMaiorQuinhentos(ChainDesconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularDesconto(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.05;
		}
		/*
		 * Se a regra n�o for aplic�vel, o pr�ximo desconto ser� 
		 * chamado
		 */
		return proximo.calcularDesconto(orcamento);
	}

}
