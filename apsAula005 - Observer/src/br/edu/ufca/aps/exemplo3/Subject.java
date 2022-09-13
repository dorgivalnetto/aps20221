package br.edu.ufca.aps.exemplo3;

public interface Subject {

	public void adicionarAssinante(Observer a1);
	
	public void removerAssinante(Observer a1);
	
	public void notificarAssinante(Mensagem m);
}
