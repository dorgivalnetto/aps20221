package br.edu.ufca.aps.exemplo03;

public class Patolino implements Pato{
	
	@Override
	public void grasnar() {
		System.out.println("Grasnou como patolino");
	}
	
	@Override
	public void voar() {
		System.out.println("Voou como patolino");
		
	}
}
