package br.edu.ufca.aps.desafio3;

public class CasaDeVidro extends Casa {

	@Override
	public void construirParedes() {
		System.out.println("Construindo paredes de vidro");
	}

	@Override
	public void construirColunas() {
		System.out.println("Construindo colunas com revestimento de vidro");
	}
}
