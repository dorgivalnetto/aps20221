package br.edu.ufca.aps.exemplo00;

public class CarroFabrica {

	public static Carro consturirCarro(TipoCarro modelo) {
		Carro carro = null;
		switch(modelo) {
		case SEDAN:
			carro = new CarroSedan();
			break;
		case LUXO:
			carro = new CarroLuxo();
			break;
		default:
			//lançar exceção
			break;
		}
	return carro;
	}
}
