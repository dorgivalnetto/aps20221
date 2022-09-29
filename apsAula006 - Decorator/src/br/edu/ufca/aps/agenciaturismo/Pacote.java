package br.edu.ufca.aps.agenciaturismo;

public abstract class Pacote {

	private String desc;
	private double preco;
	
	public Pacote(String desc, double preco) {
		this.desc = desc;
		this.preco = preco;
	}
	public String getDesc() {
		return desc;
	}
	public Double getPreco() {
		return preco;
	}	
}
