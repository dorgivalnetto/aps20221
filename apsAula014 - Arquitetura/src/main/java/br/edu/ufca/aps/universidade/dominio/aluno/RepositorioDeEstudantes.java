package br.edu.ufca.aps.universidade.dominio.aluno;

import java.util.List;

public interface RepositorioDeEstudantes {

	public void matricular(Estudante estudante);
	public Estudante buscarPorCPF(CPF cpf);
	public List<Estudante> listarTodosAlunosMatriculados();
}
