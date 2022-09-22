package br.edu.ufca.aps.exemplo4;

public abstract class JanelaDecorator implements Janela{

	protected Janela janelaDecorada;
	
	public JanelaDecorator(Janela janelaDecorada) {
		this.janelaDecorada = janelaDecorada;
	}
}
