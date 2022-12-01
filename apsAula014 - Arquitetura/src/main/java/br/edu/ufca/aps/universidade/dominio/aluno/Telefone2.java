package br.edu.ufca.aps.universidade.dominio.aluno;

public class Telefone2 {

	private String DDD;
	private String numero;
	
	public Telefone2(String ddd, String numero) {
		if (ddd == null || numero == null) {
			throw new IllegalArgumentException("DDD e Número são obrigatórios");
		}
		
		if (!ddd.matches("\\d{2}")){
			throw new IllegalArgumentException("DDD inválido!");
		}
		
		if (!numero.matches("\\d{8}|\\d{9}")) {
			throw new IllegalArgumentException("Número inválido!");
		}
		
		this.DDD = ddd;
		this.numero = numero;
	}

	public String getDDD() {
		return DDD;
	}

	public void setDdd(String ddd) {
		this.DDD = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setDDD(String dDD) {
		DDD = dDD;
	}
	
	

	//testar o telefone com JUnit
}
