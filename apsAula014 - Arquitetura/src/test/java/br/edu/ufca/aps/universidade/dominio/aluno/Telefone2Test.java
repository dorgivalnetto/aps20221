package br.edu.ufca.aps.universidade.dominio.aluno;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.ufca.aps.universidade.dominio.aluno.Telefone2;

public class Telefone2Test {

	@Test
	public void telefoneComDDDInvalido() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone2(null, "123456789"));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone2("", "123456789"));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone2("0", "123456789"));
	}
	
	@Test
	public void telefoneComNumeroInvalido() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone2("88", null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone2("88", ""));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone2("88", "123456"));
	}
	
	@Test
	public void telefoneComDDDeNumeroValidos() {
		String ddd = "88";
		String numero = "123456789";
		Telefone2 fone = new Telefone2(ddd, numero);
		assertEquals(ddd, fone.getDDD());
		assertEquals(numero, fone.getNumero());
	}

}
