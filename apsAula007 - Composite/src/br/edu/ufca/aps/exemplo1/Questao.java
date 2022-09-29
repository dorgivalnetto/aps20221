package br.edu.ufca.aps.exemplo1;

public class Questao extends ElementoDoQuestionario{

	public Questao(String descricao) {
		super(descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exibir() {
		// TODO Auto-generated method stub
		System.out.println("Questão: " + descricao);
	}
	
	

}
