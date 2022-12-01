package br.edu.ufca.aps.universidade.infra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.edu.ufca.aps.universidade.dominio.aluno.CPF;
import br.edu.ufca.aps.universidade.dominio.aluno.Email;
import br.edu.ufca.aps.universidade.dominio.aluno.Estudante;
import br.edu.ufca.aps.universidade.dominio.aluno.EstudanteNaoEncontrado;
import br.edu.ufca.aps.universidade.dominio.aluno.RepositorioDeEstudantes;
import br.edu.ufca.aps.universidade.dominio.aluno.Telefone2;
import br.edu.ufca.aps.universidade.dominio.aluno.TestaAluno;

public class RepositorioEstudanteComJDBC implements RepositorioDeEstudantes{

	private Connection connection;
	
	public RepositorioEstudanteComJDBC(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void matricular(Estudante estudante) {
		// TODO Auto-generated method stub
		try {
			String sql = "INSERT INTO ESTUDANTE VALUES(?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, estudante.getCpf());
			ps.setString(2, estudante.getNome());
			ps.setString(3, estudante.getEmail());
			ps.execute();
			
			sql = "INSERT INTO TELEFONES(?, ?)";
			ps = connection.prepareStatement(sql);
			for (Telefone2 telefone: estudante.getTelefones()) {
				ps.setString(1, telefone.getDDD());
				ps.setString(2, telefone.getNumero());
			}
			
			//declarar a dependência do BD no pom.xml
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public Estudante buscarPorCPF(CPF cpf) {
		try {
			String sql = "SELECT id, nome, email FROM ESTUDANTE WHERE cpf = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, cpf.getNumero());
			
			ResultSet rs = ps.executeQuery();
			boolean encontrou = rs.next();
			if(!encontrou) {
				throw new EstudanteNaoEncontrado(cpf);
			}
			
			String nome = rs.getString("nome");
			Email email = new Email(rs.getString("email"));
			Estudante encontrado = new Estudante(cpf, nome, email);
			
			Long id = rs.getLong("id");
			sql = "SELECT dd, numero FROM TELEFONE WHERE estudante_ID = ?";
			ps = connection.prepareStatement(sql);
			ps.setLong(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				String numero = rs.getString("numero");
				String ddd = rs.getString("ddd");
				encontrado.adicionarTelefone(ddd, numero);
			}
			return encontrado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Estudante> listarTodosAlunosMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}
