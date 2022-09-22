package br.edu.ufca.aps.exemplo5;

public class Auxiliar extends Cargo {

	public Auxiliar(double salario, String descricao) {
		super(salario, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return salario + 1000;
	}

	@Override
	public String mostraNome() {
		// TODO Auto-generated method stub
		return "Auxiliar";
	}

}
