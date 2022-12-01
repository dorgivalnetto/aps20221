package br.edu.ufca.aps.exemplo02;

public interface CarroFabrica {

	public Sedan criarSedan(int id, String nome, double valor, Cor cor);
	public Luxo criarLuxo(int id, String nome, double valor, Cor cor);
	
	default void mostrarFabricante() {
		System.out.println(this.getClass().getSimpleName() + " fabricou este carro!");
	}
}
