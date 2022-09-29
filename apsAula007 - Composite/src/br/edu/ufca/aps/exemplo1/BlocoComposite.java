package br.edu.ufca.aps.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class BlocoComposite extends ElementoDoQuestionario{

	private List<ElementoDoQuestionario> elementos = 
			new ArrayList<ElementoDoQuestionario>();
	
	public BlocoComposite(String descricao) {
		super(descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exibir() {
		// TODO Auto-generated method stub
		System.out.println("Bloco: " + descricao);
		for(int i = 0; i < elementos.size(); i++) {
			elementos.get(i).exibir();
		}
	}
	
	public void adicionar(ElementoDoQuestionario elemento) {
		elementos.add(elemento);
	}
	
	public void remover(ElementoDoQuestionario elemento) {
		for(int i = 0; i < elementos.size(); i++) {
			elementos.remove(elementos.get(i));
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
