package br.edu.ufca.aps.exemplo00;

public abstract class Carro {
	
	private TipoCarro modelo = null;
	
	public Carro(TipoCarro modelo) {
		this.modelo = modelo;
		organizarPecas();
	}
	
	private void organizarPecas() {
		System.out.println("Organizando peças");
	}
	
	protected abstract void construir();

	public TipoCarro getModelo() {
		return modelo;
	}

	public void setModelo(TipoCarro modelo) {
		this.modelo = modelo;
	}
	
	
	

}
