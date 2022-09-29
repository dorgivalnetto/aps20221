package br.edu.ufca.aps.exemplo2;

public class SalaLeaf implements Estrutura {

	public String name;
	
	public SalaLeaf(String name) {
		this.name = name;
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub
		System.out.println("Voc� entrou no " + this.name);
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.out.println("Voc� deixou o "+ this.name);
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("Voc� est� atualmente em " + this.name);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
