package br.edu.ufca.aps.exemplo2;

public class DescontoMaiorQuinhentos extends Desconto {

	public DescontoMaiorQuinhentos(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcular(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.05;
		}
		return proximo.calcular(orcamento);
	}

}
