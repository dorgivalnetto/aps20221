package br.edu.ufca.aps.exemplo3;

public class AssinanteMensagemDois implements Observer {

	@Override
	public void atualizar(Mensagem m) {
		// TODO Auto-generated method stub
		System.out.println("Assinante da mensagem dois: " + m.getConteudoMensagem());
	}

}
