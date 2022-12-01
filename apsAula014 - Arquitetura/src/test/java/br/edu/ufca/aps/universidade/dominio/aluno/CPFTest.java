package br.edu.ufca.aps.universidade.dominio.aluno;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.ufca.aps.universidade.dominio.aluno.CPF;

public class CPFTest {

	@Test
	public void CPFcomNumerosInvalidos() {
		/*Requer que a execução do objeto do tipo Executable passado
		como parâmetro lance um exceção do tipo esperado.*/
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF(null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF(""));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF("12345678900"));
	}
	
	@Test
	public void CPFcomNumerosValidos() {
		String numero = "123.456.789-00";
		CPF cpf = new CPF(numero);
		assertEquals(numero, cpf.getNumero());
	}

}
