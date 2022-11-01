package br.edu.ufca.aps.exemplo01;

public interface ContaInterface {

	public void depositar(double valor);
	public void sacar(double valor);
	public void transferir(int destinatario,
			double quantia);
	public int getNumeroConta();
}
