package br.edu.ufca.aps.exemplo1;

public class TestaQuestionario {

	public static void main(String[] args) {
		BlocoComposite blocoA = new BlocoComposite
				("Análise e Projeto de Sistemas");
		Questao questao1 = new Questao("Cite um padrão comportamental.");
		Questao questao2 = new Questao
				("Qual o objetivo do padrão Composite?");
		
		blocoA.adicionar(questao1);
		blocoA.adicionar(questao2);
		
		BlocoComposite blocoB = new BlocoComposite
				("Programação Orientada a Objetos");
		BlocoComposite blocoB1 = new BlocoComposite("Composição.");
		Questao questao3 = new Questao("O que é composição recursiva?");
		
		blocoB1.adicionar(questao3);
		blocoB.adicionar(blocoB1);
		
		BlocoComposite blocoRaiz = new BlocoComposite("Java");
		blocoRaiz.adicionar(blocoA);
		blocoRaiz.adicionar(blocoB);
		
		blocoRaiz.exibir();
		
		
	}
}
