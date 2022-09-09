package br.edu.ufca.aps.exemplo2;
/*
 * A classe abstrata define um método padrão que contém um
 * esqueleto de algum algoritmo composto de chamadas, geralmente
 * para operações abstratas primitivas. Subclasses concretas
 * implementam essas operações, mas deixam o método padrão em si
 * intacto. 
 */
public abstract class TMDesconto {

	protected TMDesconto proximo;
	
	public TMDesconto(TMDesconto proximo2) {
		this.proximo = proximo2;
	}
	
	/* Devemos verificar se o desconto deve ser aplicado, caso seja,
	 * o cálculo deve ser realizado de acordo com a respectiva regra
	 * caso o desconto não seja aplicado, verificamos para a próxima
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
