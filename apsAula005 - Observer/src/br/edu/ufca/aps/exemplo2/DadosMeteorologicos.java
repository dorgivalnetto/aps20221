package br.edu.ufca.aps.exemplo2;

import java.util.ArrayList;

public class DadosMeteorologicos implements DadosMeteorologicosSubject {

	private float temperatura;
	private float umidade;
	private float pressao;
	private ArrayList<Observer> observadores;
	
	public DadosMeteorologicos() {
		observadores = new ArrayList<Observer>();
	}
	
	public void medicaoMudou(){
		notificarObservador();
	}
	
	public void configurarMedicoes(float temp, float umid, float pressao) {
		this.temperatura = temp;
		this.umidade = umid;
		this.pressao = pressao;
		medicaoMudou();
	}

	@Override
	public void adicionarObservador(Observer o1) {
		// TODO Auto-generated method stub
		observadores.add(o1);
	}

	@Override
	public void removerObservador(Observer o1) {
		// TODO Auto-generated method stub
		for(int i=0; i < observadores.size(); i++) {
			if (i == observadores.indexOf(o1)) {
				observadores.remove(i);
			}
		}
	}

	@Override
	public void notificarObservador() {
		// TODO Auto-generated method stub
		for(int i=0; i < observadores.size(); i++) {
			observadores.get(i).
			atualizar(temperatura, umidade, pressao);
		}
	}
	
	
	
}
