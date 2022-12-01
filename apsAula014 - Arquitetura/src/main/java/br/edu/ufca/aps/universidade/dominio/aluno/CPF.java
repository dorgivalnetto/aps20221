package br.edu.ufca.aps.universidade.dominio.aluno;

public class CPF {
	
	//VALUE OBJECT
	
	private String numero;

	public CPF(String numero) {
		if(numero == null || !numero.matches(
				"\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))
		{
			throw new IllegalArgumentException("CPF invalido!");
		}
		this.numero = numero;
	}

	
	//testar o CPF com JUnit
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	
	
}
