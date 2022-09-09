package br.edu.ufca.exemplo2;

public class Presidente extends Gestor {

	
	public Presidente(double limite, String cargo, Gestor sucessor) {
		super(limite, cargo, sucessor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aprovarVerba(Verba v) {
		// TODO Auto-generated method stub
		if(v.getValor() > 3000){
			System.out.println("Verba de " + v.getValor() +
					" aprovada por cargo: " + this.getCargo() ); 
		}else {
			suc.aprovarVerba(v);
		}
	}

	
}
