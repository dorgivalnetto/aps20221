package br.edu.ufca.aps;

public abstract class ChainDesconto {

	/* Cada desconto tem a sua regra, mas se a regra do desconto
	 * não for aplicável para um determinado caso a classe 
	 * Desconto chama o próximo tipo de desconto
	 */
	protected ChainDesconto proximo;
	
	public ChainDesconto(ChainDesconto prox) {
		this.proximo = prox;
	}
	
	public abstract double calcularDesconto(Orcamento orcamento);
}
