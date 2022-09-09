package br.edu.ufca.aps.exemplo2;

public abstract class Desconto {

	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public abstract double calcular(Orcamento orcamento);
}
