package br.edu.ufca.aps.universidade.dominio.aluno;

/* Exemplo do Padr�o de Projeto Builder 
 * (https://refactoring.guru/pt-br/design-patterns/builder)
 * O Builder � um padr�o de projeto criacional que permite a voc� 
 * construir objetos complexos passo a passo.
 * O padr�o permite que voc� produza diferentes tipos e representa��es
 * de um objeto usando o mesmo c�digo de constru��o.
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
