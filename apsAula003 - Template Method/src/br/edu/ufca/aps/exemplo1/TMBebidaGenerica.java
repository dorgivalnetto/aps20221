package br.edu.ufca.aps.exemplo1;

public abstract class TMBebidaGenerica {

	//ALGORITMO a receita não deve mudar
	final void prepararReceita() {
		ferverAgua();
		prepararInfusao();
		colocarNaXicara();
		adicionarCondimentos();
	}
	
	//Serão implementadas nas classes filhas
	abstract void prepararInfusao();
	abstract void adicionarCondimentos();
	
	public void ferverAgua() {
		System.out.println("Fervendo água");
	}
	
	public void colocarNaXicara() {
		System.out.println("Colocando na xícara");
	} 
}
