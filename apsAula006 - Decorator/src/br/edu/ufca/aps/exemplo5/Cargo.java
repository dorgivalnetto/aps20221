package br.edu.ufca.aps.exemplo5;

public abstract class Cargo {

	protected double salario;
	protected String descricao;
	
	public Cargo(double salario, String descricao) {
		// TODO Auto-generated constructor stub
		this.salario = salario;
		this.descricao = descricao;
	}
	
	public abstract double calculaSalario();
	
	public abstract String mostraNome();
}
