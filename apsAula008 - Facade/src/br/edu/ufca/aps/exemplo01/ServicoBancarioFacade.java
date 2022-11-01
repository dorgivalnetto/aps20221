package br.edu.ufca.aps.exemplo01;

import java.util.HashMap;
import java.util.Hashtable;

public class ServicoBancarioFacade {

	private HashMap<Integer, ContaInterface> contasBancarias;
	
	public ServicoBancarioFacade() {
		this.contasBancarias = new HashMap<Integer, ContaInterface>();
	}
	
	public int criarNovaConta(String tipo, double depositoInicial) {
		ContaInterface novaConta = null;
		
		switch(tipo) {
			case "corrente":
				novaConta = new ContaCorrente(depositoInicial);
				break;
			case "poupança":
				novaConta = new ContaPoupanca(depositoInicial);
				break;
			case "investimento":
				novaConta = new Investimento(depositoInicial);
				break;
			default:
				System.out.println("O tipo da conta é inválido!");
				break;
		}
		
		if (novaConta != null) {
			this.contasBancarias.put(novaConta.getNumeroConta(), novaConta);
			return novaConta.getNumeroConta();
		}
		return -1;
	}
	
	public void transferir(int remetente, int destinatario, double quantidade) {
		ContaInterface paraDestinatario = this.contasBancarias.get(destinatario);
		ContaInterface doRemetente = this.contasBancarias.get(remetente);
		doRemetente.transferir(paraDestinatario.getNumeroConta(), quantidade);
	}
}
