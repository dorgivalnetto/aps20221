package br.edu.ufca.aps.exemplo3;

public class AssinanteMensagemUm implements Observer {

	@Override
	public void atualizar(Mensagem m) {
		// TODO Auto-generated method stub
		System.out.println("Assinante da mensagem um: " + m.getConteudoMensagem());
	}

}
