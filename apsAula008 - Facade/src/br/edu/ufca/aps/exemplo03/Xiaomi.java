package br.edu.ufca.aps.exemplo03;

public class Xiaomi implements LojaCelular {

	private double preco;
	private String modelo;
	private int estoque;
	
	public Xiaomi() {
		this.preco = 1289.05;
		this.modelo = "Xiaomi Redmi Note 11";
		this.estoque = 18;
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
