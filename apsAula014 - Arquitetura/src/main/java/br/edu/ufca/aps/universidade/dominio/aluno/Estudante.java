package br.edu.ufca.aps.universidade.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Estudante {

	//ENTIDADE
	private CPF cpf;
	private String nome;
	private Email email;
	private List<Telefone2> telefones = new ArrayList<Telefone2>();
	
	/*
	 *  Todas as propriedades são primitivas, o que significa que 
	 *  nenhuma delas traz consigo nenhum significado, nenhuma 
	 *  cobertura de estado e nenhuma funcionalidade
	 *  
	 *  Por exemplo, como garantir que o CPF é válido?
	 */
	
	/*
	 * Não existem construtores para inicialização,
	 * o que significa que a instância é criada sem 
	 * que suas propriedades sejam preenchidas
	 */
	
	
	public Estudante(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	/*
	 * Métodos públicos = permitem que a qualquer momento seja 
	 * possível alterar o valor da propriedade
	 */
	public void adicionarTelefone(String ddd, String telefone) {
		this.telefones.add(new Telefone2(ddd, telefone));
	}

	public String getCpf() {
		return cpf.getNumero();
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email.getEndereco();
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public List<Telefone2> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone2> telefones) {
		this.telefones = telefones;
	}	
	
	
}
