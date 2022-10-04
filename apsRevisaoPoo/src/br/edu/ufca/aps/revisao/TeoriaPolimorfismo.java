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
	 * Uma subclasse pode redefinir (sobrescrever) um método herdado
	 * Este mecanismo é chamado de polimorfismo–O polimorfismo se 
	 * realiza através da recodificação de um ou mais métodos 
	 * herdados por uma subclasse
	 * Em tempo de execução, o Java saberá qual implementação deve ser usada
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
