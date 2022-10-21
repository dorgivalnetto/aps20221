package br.edu.ufca.aps.desafio1;

public class TestCompositePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape tri1 = new Triangle();
		Shape tri2 = new Triangle();
		Shape cir1 = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri2);
		drawing.add(cir1);
		
		drawing.draw("Vermelha");
		
		drawing.clear();
		
		drawing.add(tri1);
		drawing.add(cir1);
		drawing.draw("Verde");
	}

}
