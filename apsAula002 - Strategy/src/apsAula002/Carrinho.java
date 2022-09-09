package apsAula002;
import java.util.ArrayList;

public class Carrinho {

	private double valor;
	private int quantidade;
	private String nomeUsuario;
	private ArrayList<CarrinhoItens> itens;
	
	
	public ArrayList<CarrinhoItens> getItens() {
		return itens;
	}

	public void setItens(ArrayList<CarrinhoItens> itens) {
		this.itens = itens;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String username) {
		this.nomeUsuario = username;
	}

	public static Carrinho criarCarrinho(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
