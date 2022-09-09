package br.edu.ufca.aps;

public abstract class ChainDesconto {

	/* Cada desconto tem a sua regra, mas se a regra do desconto
	 * n�o for aplic�vel para um determinado caso a classe 
	 * Desconto chama o pr�ximo tipo de desconto
	 */
	protected ChainDesconto proximo;
	
	public ChainDesconto(ChainDesconto prox) {
		this.proximo = prox;
	}
	
	public abstract double calcularDesconto(Orcamento orcamento);
}
