package br.edu.ufca.aps.exemplo2;

public class DescontoMaisCincoItens extends Desconto {

	public DescontoMaisCincoItens(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcular(Orcamento orcamento) {
		if (orcamento.getQuantidadeItem() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return proximo.calcular(orcamento);
	}
	
	

}
