package br.edu.ufca.aps.exemplo3;

import java.util.ArrayList;

public class EditoraSubject implements Subject {

	private String estado;
	private ArrayList<Observer> observadores = new ArrayList<Observer>();
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public void adicionarAssinante(Observer a1) {
		// TODO Auto-generated method stub
		observadores.add(a1);
	}

	@Override
	public void removerAssinante(Observer a1) {
		// TODO Auto-generated method stub
		observadores.remove(a1);
	}

	@Override
	public void notificarAssinante(Mensagem m) {
		// TODO Auto-generated method stub
		for (Observer o: observadores) {
			o.atualizar(m);
		}
	}

		
}
