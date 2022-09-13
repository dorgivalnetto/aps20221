package br.edu.ufc.aps.exemplo1;

public abstract class Subject {
	
	public abstract void adicionarObservador(Observer observador);
	
	public abstract void removerObservador(Observer observador);
	
	public abstract void notificarTodosObservadores();
}
