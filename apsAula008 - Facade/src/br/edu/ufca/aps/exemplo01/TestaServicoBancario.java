package br.edu.ufca.aps.exemplo01;

public class TestaServicoBancario {

	/*
	 * Vamos utilizar a classe Fachada para acessar o subsistema
	 * A classe de teste n�o precisa se preocupar em criar e
	 * gerenciar suas pr�prias contas. Precisa saber apenas sobre
	 * o servicoBancario e o conjunto de comportamentos que ele
	 * � capaz de realizar
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServicoBancarioFacade meuBanco = 
				new ServicoBancarioFacade();
		
		int minhaPoupanca = meuBanco.criarNovaConta(
				"poupan�a", 500.0);
		
		int meusInvestimentos = meuBanco.criarNovaConta(
				"investimento", 1000);
		
		meuBanco.transferir(minhaPoupanca, 
				meusInvestimentos, 300);
	}

}
