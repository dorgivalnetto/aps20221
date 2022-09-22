package br.edu.ufca.aps.exemplo5;

public class Adjunto extends Cargo {

	public Adjunto(double salario, String descricao) {
		super(salario, descricao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return salario + 2500;
	}

	@Override
	public String mostraNome() {
		// TODO Auto-generated method stub
		return "Adjunto";
	}

}
