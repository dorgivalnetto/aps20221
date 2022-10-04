package br.edu.ufca.aps.revisao;

public class TeoriaPolimorfismo {

	public class Carro {
		protected int velocidade;
		
		public Carro(int velocidadeInicial) {
			velocidade = velocidadeInicial;
		}
		
		public void acelera() {
			velocidade++;
		}
		
		public void frea() {
			velocidade--;
		}
	}
	
	/*
	 * Uma subclasse pode redefinir (sobrescrever) um m�todo herdado
	 * Este mecanismo � chamado de polimorfismo�O polimorfismo se 
	 * realiza atrav�s da recodifica��o de um ou mais m�todos 
	 * herdados por uma subclasse
	 * Em tempo de execu��o, o Java saber� qual implementa��o deve ser usada
	 */
	
	public class CarroCorrida extends Carro {
		public CarroCorrida(int velocidadeInicial) {
			super(velocidadeInicial);
		}
		
		public void acelera() {
			velocidade+=5;
		}
	}
	
	public static void main(String[] args) {
		CarroCorrida f1 = new CarroCorrida(10);
		f1.acelera();
	}
	
}
