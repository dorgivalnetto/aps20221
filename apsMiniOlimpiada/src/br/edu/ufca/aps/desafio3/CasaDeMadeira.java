package br.edu.ufca.aps.desafio3;

public class CasaDeMadeira extends Casa{

	@Override
	public void construirParedes() {
		System.out.println("Contruindo paredes de madeira");
	}

	@Override
	public void construirColunas() {
		System.out.println("Construindo colunas com revestimento de madeira");
	}

}
