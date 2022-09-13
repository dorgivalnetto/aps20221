package br.edu.ufca.aps.exemplo3;

public class AssinanteMensagemTres implements Observer {

	@Override
	public void atualizar(Mensagem m) {
		// TODO Auto-generated method stub
		System.out.println("Assinante da mensagem três: " + m.getConteudoMensagem());
	}

}
