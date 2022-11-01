package br.edu.ufca.aps.exemplo03;

public class Apple implements LojaCelular {

	private double preco;
	private String modelo;
	private int estoque;
	
	public Apple() {
		this.preco = 4799;
		this.modelo = "Apple iPhone 13";
		this.estoque = 32;
	}
	
	//4799.00
	@Override
	public double getPreco() {
		System.out.println("Preço R$: " + preco);
		return this.preco;
	}

	//"Apple iPhone 13";
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
