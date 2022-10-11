package br.edu.ufca.aps.revisao01;

import java.util.ArrayList;

public class Eleicao {
	
	protected ArrayList<CandidatoObserver> candidatos;
	protected Candidato candidato;
	
	public Eleicao() {
		this.candidatos = new ArrayList<CandidatoObserver>();
	}
	
	public void adicionar(CandidatoObserver candidato) {
		candidatos.add(candidato);
	}
	
	public void remover(int indice) {
		candidatos.remove(indice);
	}
	
	public void atualizarEstado(Candidato candidato) {
		this.candidato = candidato;
		notificarObservadores();
	}

	private void notificarObservadores() {
		for(CandidatoObserver candidato: candidatos) {
			candidato.atualizar();
		}
	}
	
	public Candidato getEstado() {
		return candidato;
	}

}
