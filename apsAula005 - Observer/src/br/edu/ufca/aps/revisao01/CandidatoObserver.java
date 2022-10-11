package br.edu.ufca.aps.revisao01;

public abstract class CandidatoObserver {
	
	protected Eleicao candidato;
	
	public CandidatoObserver(Eleicao candidato) {
		this.candidato = candidato;
	}
	
	public abstract  void atualizar();

}
