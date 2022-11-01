package br.edu.ufca.aps.exemplo01;

public class ContaCorrente implements ContaInterface {

	public ContaCorrente(double depositoInicial) {
		System.out.println("Depósito inicial realizado no valor de R$ " + depositoInicial);
	}

	@Override
	public void depositar(double valor) {
		System.out.println("Depósito realizado no valor de R$ " + valor);
	}

	@Override
	public void sacar(double valor) {
		System.out.println("Saque realizado no valor de R$ " + valor);
	}

	@Override
	public int getNumeroConta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void transferir(int destinatario, double quantia) {
		System.out.println("Transferência realizada para a conta " + destinatario + " no valor de R$ " + quantia);
	}
}
