package br.edu.ufca.aps.exemplo1;

public abstract class ElementoDoQuestionario {

	protected String descricao;
	
	public ElementoDoQuestionario(String descricao) {
		this.descricao = descricao;
	}
	
	public abstract void exibir();
}
