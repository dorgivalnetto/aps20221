package br.edu.ufca.aps.hook;

public abstract class BebidaQuenteHook {

	//a receita não deve mudar
		final void prepararReceita() {
			ferverAgua();
			prepararInfusao();
			colocarNaXicara();
			if (clienteQuerCondimento()) {
				adicionarCondimentos();
			}
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
		
		boolean clienteQuerCondimento() {
			return true;
		}
}
