package br.edu.ufca.aps.revisao01;

public class PublicarResultado extends CandidatoObserver{

	public PublicarResultado(Eleicao candidato) {
		super(candidato);
	}

	@Override
	public void atualizar() {
		System.out.println("Divulgando o resultado da eleição");
	}

	
}
