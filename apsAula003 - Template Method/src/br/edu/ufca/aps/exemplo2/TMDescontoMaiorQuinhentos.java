package br.edu.ufca.aps.exemplo2;

/*
 * Classes concretas têm que implementar todas as operações
 * abstratas da classe base, mas não podem sobrescrever o método
 * padrão em si.
 */
public class TMDescontoMaiorQuinhentos extends TMDesconto {

	public TMDescontoMaiorQuinhentos(TMDesconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public boolean deveAplicarDesconto(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

}
