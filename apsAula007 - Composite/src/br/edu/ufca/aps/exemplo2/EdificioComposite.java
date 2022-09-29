package br.edu.ufca.aps.exemplo2;

import java.util.ArrayList;

public class EdificioComposite implements Estrutura {

	private ArrayList<Estrutura> estruturas;
	private String endereco;
	
	public EdificioComposite(String endereco) {
		this.estruturas = new ArrayList<Estrutura>();
		this.endereco = endereco;
	}
	
	public int adicionar(Estrutura estrutura) {
		this.estruturas.add(estrutura);
		return this.estruturas.size()-1;
	}
		
	public Estrutura getEstrutura(int numComponente) {
		return this.estruturas.get(numComponente);
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub
		System.out.println("Seja bem-vindo(a) ao "+ this.getName());
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.out.println("Agradecemos a visita! Volte sempre ao " + this.getName());
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("Você está atualemnete em "+ this.getName());
		for(Estrutura estrutura: this.estruturas ) {
			System.out.println(estrutura.getName());
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.endereco;
	}

}
