package br.edu.ufca.aps.exemplo03;

public class Samsung implements LojaCelular {

	private double preco;
	private String modelo;
	private int estoque;
	
	public Samsung() {
		this.preco = 2599.99;
		this.modelo = "Samsung Galaxy A52s";
		this.estoque = 56;
	}
	
	@Override
	public double getPreco() {
		System.out.println("Preço R$: " + preco);
		return this.preco;
	}

	@Override
	public String getModelo() {
		System.out.println("Modelo: " + modelo );
		return this.modelo;
	}

	@Override
	public int getQuantidade() {
		System.out.println("Quantidade em estoque: " + estoque);
		return this.estoque;
	}
}
