package br.edu.ufca.aps.exemplo02;

public class CaldeiraChocolateSincronizado {

	private boolean empty;
	private boolean boiled;
	private static CaldeiraChocolateSincronizado uniqueInstance;
	
	//s� � iniciado quando a caldeira est� vazia
	private CaldeiraChocolateSincronizado() {
		this.empty = true;
		this.boiled = true;
	}
	
	public static synchronized CaldeiraChocolateSincronizado getInstance() {
		if(uniqueInstance == null) {
			System.out.println("Criando uma �nica inst�ncia da Caldeira de Chocolate");
			uniqueInstance = new CaldeiraChocolateSincronizado();
		}
		System.out.println("Retornano a inst�ncia da Caldeira de Chocolate");
		return uniqueInstance;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			//preencha a caldeira com uma mistura de leite e chocolate
		}
	}
	
	//para drenar a caldeira ela deve estar cheia e tamb�m em ebuli��o
	public void drain() {
		if(isEmpty() && isBoiled()) {
			//drene o leite e o chocolate fervidos
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			//coloque o conte�do em ebuli��o
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
	
	
}
