package br.edu.ufca.aps.universidade.dominio.aluno;

public class EstudanteNaoEncontrado extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public EstudanteNaoEncontrado(CPF cpf) {
		super("Estudante n�o encontrado com CPF: " + cpf.getNumero());
	}

}
