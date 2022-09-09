package br.edu.ufca.aps.exemplo2;

public class Orcamento {

	private double valor;
	private int quantidadeItem;

	public Orcamento(double valor, int qtdeItem) {
		this.valor = valor;
		this.quantidadeItem = qtdeItem;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidadeItem() {
		return quantidadeItem;
	}

	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	
	
	
}
