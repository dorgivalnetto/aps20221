package br.edu.ufca.aps.exemplo02;

public class Jeep implements CarroFabrica{

	@Override
	public Sedan criarSedan(int id, String nome, double valor, Cor cor) {
		mostrarFabricante();
		cor.pintar();
		return new Sedan(id, nome, valor, cor);
	}

	@Override
	public Luxo criarLuxo(int id, String nome, double valor, Cor cor) {
		mostrarFabricante();
		cor.pintar();
		return new Luxo(id, nome, valor, cor);
	}

}
