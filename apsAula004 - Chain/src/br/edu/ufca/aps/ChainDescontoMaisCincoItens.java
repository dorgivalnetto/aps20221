package br.edu.ufca.aps;

public class ChainDescontoMaisCincoItens extends ChainDesconto {

	public ChainDescontoMaisCincoItens(ChainDesconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularDesconto(Orcamento orcamento) {
		if (orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor() * 0.1;
		}
		/* 
		 * Se a regra não for aplicável, basta fazer com que todo 
		 * desconto receba um próximo desconto
		 */
		return proximo.calcularDesconto(orcamento);
	}
	
	

}
