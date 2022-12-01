package br.edu.ufca.aps.exemplo3;

public class ContaBancariaFactory {

	public ContaBancaria criarConta(String tipo) {
		ContaBancaria contaBancaria = null;
		
		if (tipo.equals("P")) {
			contaBancaria = new ContaPoupanca();
		} else if (tipo.equals("J")) {
			contaBancaria = new ContaJuridica();
		} else if (tipo.equals("C")) {
			contaBancaria = new ContaCorrente();
		} else {
			System.out.println("Tipo de conta inválida");
		}
		
	return contaBancaria;
	}
	
}
