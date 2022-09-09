package br.edu.ufca.aps;

public class Orcamento {

	private double valor;
	private int quantidadeItens;
	
	public Orcamento(double valor, int qtdeItem) {
		this.valor = valor;
		this.quantidadeItens = qtdeItem;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	
	
}
