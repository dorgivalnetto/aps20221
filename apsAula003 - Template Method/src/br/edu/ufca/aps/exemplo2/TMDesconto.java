package br.edu.ufca.aps.exemplo2;
/*
 * A classe abstrata define um m�todo padr�o que cont�m um
 * esqueleto de algum algoritmo composto de chamadas, geralmente
 * para opera��es abstratas primitivas. Subclasses concretas
 * implementam essas opera��es, mas deixam o m�todo padr�o em si
 * intacto. 
 */
public abstract class TMDesconto {

	protected TMDesconto proximo;
	
	public TMDesconto(TMDesconto proximo2) {
		this.proximo = proximo2;
	}
	
	/* Devemos verificar se o desconto deve ser aplicado, caso seja,
	 * o c�lculo deve ser realizado de acordo com a respectiva regra
	 * caso o desconto n�o seja aplicado, verificamos para a pr�xima
	 * regra.
	*/
	final double templateCalcular(Orcamento orcamento) {
		if (deveAplicarDesconto(orcamento)) {
			return efetuarCalculo(orcamento);
		} 
		return proximo.templateCalcular(orcamento);
	}
	
	protected abstract double efetuarCalculo(Orcamento orcamento);
	public abstract boolean deveAplicarDesconto(Orcamento orcamento);
}
