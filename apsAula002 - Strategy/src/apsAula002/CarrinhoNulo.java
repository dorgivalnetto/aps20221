package apsAula002;

import java.util.ArrayList;

public class CarrinhoNulo extends Carrinho {

	public ArrayList<CarrinhoItens> getItens(){
		return new ArrayList<CarrinhoItens>();
	}
	
	public double getValor() {
		return 0.0;
	}
	
	public int getQuantidade() {
		return 0;
	}
	
	public String getNomeUsuario() {
		return "Volte a tela de login e realize a autenticação!";
	}
}
