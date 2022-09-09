package br.edu.ufca.exemplo2;

/*
 * A estrutura de cadeia não possui qualquer informação sobre as classes
 * que compõem a cadeia. Da mesma forma, uma classe da cadeia não tem 
 * nenhuma noção sobre o formato da estrutura ou sobre elementos nela 
 * inseridos.
 */
public class Diretor extends Gestor {

	public Diretor(double limite, String cargo, Gestor sucessor) {
		super(limite, cargo, sucessor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aprovarVerba(Verba v) {
		// TODO Auto-generated method stub
		if(v.getValor() <= 3000){
			System.out.println("Verba de " + v.getValor() 
			+ " aprovada por cargo: " + this.getCargo() ); 
		}else {
			suc.aprovarVerba(v);
		}
	}

	

}
