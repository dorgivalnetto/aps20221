package br.edu.ufca.aps.revisao01;

public class Candidato {

	private String nome;
	private int votos;
	
	public Candidato(String nome, int votos) {
		this.nome = nome;
		this.votos = votos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	
}
