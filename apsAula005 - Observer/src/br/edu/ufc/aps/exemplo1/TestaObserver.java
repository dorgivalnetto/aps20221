package br.edu.ufc.aps.exemplo1;

public class TestaObserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject subject = new ConcreteSubject();
		
		new ObservadorBinario(subject);
		new ObservadorHexa(subject);
		
		System.out.println("Primeira mudança de estado: 15");
		subject.setEstado(15);
		
		System.out.println("Segunda mudança de estado: 10");
		subject.setEstado(10);
	}

}
