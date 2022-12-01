package br.edu.ufca.aps.universidade.dominio.indicacao;

import java.time.LocalDateTime;

import br.edu.ufca.aps.universidade.dominio.aluno.Estudante;

public class Indicacao {

	private Estudante indicado;
	private Estudante indicador;
	private LocalDateTime dataIndicacao;
	
	
	public Indicacao(Estudante indicado, Estudante indicador) {
		this.indicado = indicado;
		this.indicador = indicador;
		this.dataIndicacao = LocalDateTime.now();
	}


	public Estudante getIndicado() {
		return indicado;
	}


	public Estudante getIndicador() {
		return indicador;
	}


	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}
	
	
	
	
	
}
