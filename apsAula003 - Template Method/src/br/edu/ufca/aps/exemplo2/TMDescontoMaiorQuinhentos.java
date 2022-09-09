package br.edu.ufca.aps.exemplo2;

/*
 * Classes concretas t�m que implementar todas as opera��es
 * abstratas da classe base, mas n�o podem sobrescrever o m�todo
 * padr�o em si.
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
