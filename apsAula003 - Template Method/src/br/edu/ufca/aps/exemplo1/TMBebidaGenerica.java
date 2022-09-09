package br.edu.ufca.aps.exemplo1;

public abstract class TMBebidaGenerica {

	//ALGORITMO a receita n�o deve mudar
	final void prepararReceita() {
		ferverAgua();
		prepararInfusao();
		colocarNaXicara();
		adicionarCondimentos();
	}
	
	//Ser�o implementadas nas classes filhas
	abstract void prepararInfusao();
	abstract void adicionarCondimentos();
	
	public void ferverAgua() {
		System.out.println("Fervendo �gua");
	}
	
	public void colocarNaXicara() {
		System.out.println("Colocando na x�cara");
	} 
}
