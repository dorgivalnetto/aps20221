package br.edu.ufca.aps.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject extends Subject{

	private List<Observer> observadores = new ArrayList<Observer>();
	
	private int estado;
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
		notificarTodosObservadores();
	}

	@Override
	public void adicionarObservador(Observer observador) {
		// TODO Auto-generated method stub
		observadores.add(observador);
	}

	@Override
	public void removerObservador(Observer observador) {
		// TODO Auto-generated method stub
		observadores.remove(observador);
	}

	@Override
	public void notificarTodosObservadores() {
		// TODO Auto-generated method stub
		for(int i=0; i < observadores.size(); i++) {
			observadores.get(i).atualizarObservador();
		}
	}
	
	
	
	
}
