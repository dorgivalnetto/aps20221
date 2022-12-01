package br.edu.ufca.aps.exemplo02;

public class CaldeiraChocolateSincronizado {

	private boolean empty;
	private boolean boiled;
	private static CaldeiraChocolateSincronizado uniqueInstance;
	
	//só é iniciado quando a caldeira está vazia
	private CaldeiraChocolateSincronizado() {
		this.empty = true;
		this.boiled = true;
	}
	
	public static synchronized CaldeiraChocolateSincronizado getInstance() {
		if(uniqueInstance == null) {
			System.out.println("Criando uma única instância da Caldeira de Chocolate");
			uniqueInstance = new CaldeiraChocolateSincronizado();
		}
		System.out.println("Retornano a instância da Caldeira de Chocolate");
		return uniqueInstance;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			//preencha a caldeira com uma mistura de leite e chocolate
		}
	}
	
	//para drenar a caldeira ela deve estar cheia e também em ebulição
	public void drain() {
		if(isEmpty() && isBoiled()) {
			//drene o leite e o chocolate fervidos
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			//coloque o conteúdo em ebulição
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
