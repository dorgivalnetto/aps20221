package br.edu.ufca.aps.exemplo3;

public class TestaMensagem {

	public static void main(String[] args) {
		AssinanteMensagemUm a1 = new AssinanteMensagemUm();
		AssinanteMensagemDois a2 = new AssinanteMensagemDois();
		AssinanteMensagemTres a3 = new AssinanteMensagemTres();
		
		EditoraSubject e1 = new EditoraSubject();
		e1.adicionarAssinante(a1);
		e1.adicionarAssinante(a2);
		
		e1.notificarAssinante(new Mensagem("Primeira Mensagem!"));
		
		e1.removerAssinante(a2);
		e1.adicionarAssinante(a3);
		
		e1.notificarAssinante(new Mensagem("Segunda Mensagem!"));
	}
}
