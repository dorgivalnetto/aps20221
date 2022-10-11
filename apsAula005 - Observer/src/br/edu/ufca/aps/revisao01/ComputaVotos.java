package br.edu.ufca.aps.revisao01;

public class ComputaVotos extends CandidatoObserver {

	public ComputaVotos(Eleicao candidato) {
		super(candidato);
	}

	@Override
	public void atualizar() {
		System.out.println(
				"Candidato: " + candidato.getEstado().getNome() 
				+ " Votos: " + candidato.getEstado().getVotos());

	}

}
