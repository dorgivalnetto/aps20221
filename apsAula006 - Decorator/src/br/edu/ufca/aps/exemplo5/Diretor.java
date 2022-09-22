package br.edu.ufca.aps.exemplo5;

public class Diretor extends Incorporado {

	public Diretor(double salario, String descricao) {
		super(salario, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return cargo.calculaSalario() + 2000;
	}

	@Override
	public String mostraNome() {
		// TODO Auto-generated method stub
		return cargo.mostraNome() + " incorporado como Diretor";
	}

}
