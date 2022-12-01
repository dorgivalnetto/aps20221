package br.edu.ufca.aps.universidade.dominio.aluno;

public class TestaAluno {

	public static void main(String[] args) {
		Estudante e1 = new Estudante(
				new CPF("123"),
				"Jose Santos",
				new Email("email@gmail.com"));
		
		EstudanteFactory fabrica = new EstudanteFactory();
		Estudante e2 = fabrica.criarAlunoCpfNomeEmail("123.456.789-00", "Joana Garcia", "joana@gmail.com")
				.criarTelefone("83", "32217887")
				.criarTelefone("88", "988667776")
				.criarEstudante();
		
	}
}
