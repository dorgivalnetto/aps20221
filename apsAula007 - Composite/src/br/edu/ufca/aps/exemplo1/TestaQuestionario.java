package br.edu.ufca.aps.exemplo1;

public class TestaQuestionario {

	public static void main(String[] args) {
		BlocoComposite blocoA = new BlocoComposite
				("An�lise e Projeto de Sistemas");
		Questao questao1 = new Questao("Cite um padr�o comportamental.");
		Questao questao2 = new Questao
				("Qual o objetivo do padr�o Composite?");
		
		blocoA.adicionar(questao1);
		blocoA.adicionar(questao2);
		
		BlocoComposite blocoB = new BlocoComposite
				("Programa��o Orientada a Objetos");
		BlocoComposite blocoB1 = new BlocoComposite("Composi��o.");
		Questao questao3 = new Questao("O que � composi��o recursiva?");
		
		blocoB1.adicionar(questao3);
		blocoB.adicionar(blocoB1);
		
		BlocoComposite blocoRaiz = new BlocoComposite("Java");
		blocoRaiz.adicionar(blocoA);
		blocoRaiz.adicionar(blocoB);
		
		blocoRaiz.exibir();
		
		
	}
}
