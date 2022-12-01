package br.edu.ufca.aps.exemplo01;

public class PoligonoFactory {

	public static Poligono criarPoligono(int numeroDeLados) {
		if(numeroDeLados == 3) {
			return new Triangulo();
		}
		if(numeroDeLados == 4) {
			return new Quadrado();
		}
		if(numeroDeLados == 5) {
			return new Pentagono();
		}
		return null;
	}
}
