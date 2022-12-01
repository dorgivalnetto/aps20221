package br.edu.ufca.aps.exemplo02;

public abstract class Carro {

	private int id;
	private String nome;
	private double preco;
	private Cor cor;
	
	public Carro(int id, String nome, double preco, Cor cor){
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.cor = cor;
	}
	
	public String toString() {
		return "id = " + id + 
			   " nome = " + nome + 
			   " preco = " + preco + 
			   " cor = " + cor.getClass().getSimpleName() +
			   " tipo = "+ this.getClass().getSimpleName();
	}
}
