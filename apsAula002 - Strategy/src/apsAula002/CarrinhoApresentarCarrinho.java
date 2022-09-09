package apsAula002;

public class CarrinhoApresentarCarrinho {

	public void colocarInformacoesCarrinho(int id) {
		Carrinho c = new Carrinho();
		if(c != null) {
			System.out.println("Valor" + c.getValor());
			System.out.println("Quantidade" + c.getQuantidade());
		}else {
			System.out.println("Valor" + 0.0);
			System.out.println("Quantidade" + 0.0);
		}
		
		if(c.getNomeUsuario() != null) {
			System.out.println("Usuário do Carrinho" + c.getNomeUsuario());
		} else {
			System.out.println("Volte a tela de login e realiza a autenticação!");
		}
	}
	
	public boolean temDesconto(Carrinho cr) {
		if (cr != null) {
			return cr.getItens().size() >= 10;
		} else {
			return false;
		}
	}
}
