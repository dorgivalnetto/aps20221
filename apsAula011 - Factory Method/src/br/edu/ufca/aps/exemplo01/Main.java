package br.edu.ufca.aps.exemplo01;

public class Main {

	public static void main(String[] args) {
		Poligono pol1 = PoligonoFactory.criarPoligono(3);
		System.out.println("Lados:" + pol1.getNumeroLados().toString() + " Polígono: " + pol1.getDescricao());
		
		Poligono pol2 = PoligonoFactory.criarPoligono(4);
		System.out.println("Lados:" + pol2.getNumeroLados().toString() + " Polígono: " + pol2.getDescricao());
		
		Poligono pol3 = PoligonoFactory.criarPoligono(5);
		System.out.println("Lados:" + pol3.getNumeroLados().toString() + " Polígono: " + pol3.getDescricao());

	}

}
