package br.edu.ufca.aps.desafio1;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

	private List<Shape> shapes = new ArrayList<Shape>();
	
	@Override
	public void draw(String fillColor) {
		// TODO Auto-generated method stub
		for(Shape sh: shapes) {
			sh.draw(fillColor);
		}
	}
	
	public void add(Shape sh) {
		this.shapes.add(sh);
	}
	
	public void remove(Shape sh) {
		this.shapes.remove(sh);
	}
	
	public void clear() {
		System.out.println("Apagando todas as formas do desenho");
		this.shapes.clear();
	}

}
