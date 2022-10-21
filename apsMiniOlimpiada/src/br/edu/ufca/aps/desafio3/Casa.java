package br.edu.ufca.aps.desafio3;

public abstract class Casa {

	public final void construirCasa(){
		construirFundacao();
		construirColunas();
		construirParedes();
		construirJanelas();
		System.out.println("Casa constru�da");
	}

	private void construirJanelas() {
		System.out.println("Construindo janelas de vidro");
	}

	public abstract void construirParedes();
	public abstract void construirColunas();

	private void construirFundacao() {
		System.out.println("Construindo a funda��o com cimento, barras de ferro e areia");
	}
}


