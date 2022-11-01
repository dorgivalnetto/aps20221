package br.edu.ufca.aps.exemplo03;

public class LojistaFacade {
	
	private LojaCelular apple;
	private LojaCelular samsung;
	private LojaCelular xiaomi;
	

	public LojistaFacade() {
		apple = new Apple();
		samsung = new Samsung();
		xiaomi = new Xiaomi();
	}
	
	public void appleVenda() {
		apple.getModelo();
		apple.getPreco();
		apple.getQuantidade();
	}
	
	public void samsungVenda() {
		samsung.getModelo();
		samsung.getPreco();
		samsung.getQuantidade();
	}
	
	public void xiaomiVenda() {
		xiaomi.getModelo();
		xiaomi.getPreco();
		xiaomi.getQuantidade();
	}
}
