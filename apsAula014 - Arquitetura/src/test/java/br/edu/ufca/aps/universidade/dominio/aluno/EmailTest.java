package br.edu.ufca.aps.universidade.dominio.aluno;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.ufca.aps.universidade.dominio.aluno.Email;

public class EmailTest {

	@Test
	public void enderecoDeEmailInvalido() {
		assertThrows(IllegalArgumentException.class,
				() -> new Email(null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(""));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Email("emailsem@estruturacorreta"));
	}

}
