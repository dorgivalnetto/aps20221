package br.edu.ufca.aps.universidade.dominio.aluno;

/* Exemplo do Padrão de Projeto Builder 
 * (https://refactoring.guru/pt-br/design-patterns/builder)
 * O Builder é um padrão de projeto criacional que permite a você 
 * construir objetos complexos passo a passo.
 * O padrão permite que você produza diferentes tipos e representações
 * de um objeto usando o mesmo código de construção.
 */
public class EstudanteFactory {

	private Estudante estudante;
	
	public EstudanteFactory criarAlunoCpfNomeEmail(String cpf, String nome, String email) {
		this.estudante = new Estudante(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	public EstudanteFactory criarTelefone(String ddd, String telefone) {
		this.estudante.adicionarTelefone(ddd, telefone);
		return this;
	}
	
	public Estudante criarEstudante() {
		return this.estudante;
	}
	
	
}
