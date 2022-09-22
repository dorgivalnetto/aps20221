package br.edu.ufca.aps.exemplo5;

public abstract class Incorporado extends Cargo {

	protected Cargo cargo;
	
	public Incorporado(double salario, String descricao) {
		super(salario, descricao);
		// TODO Auto-generated constructor stub
	}

	public void setIncorporacao(Cargo cargo) {
		this.cargo = cargo;
	}

}
