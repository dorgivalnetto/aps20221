package br.edu.ufca.aps.exemplo2;

public interface DadosMeteorologicosSubject {

	public void adicionarObservador(Observer o1);
	
	public void removerObservador(Observer o1);
	
	public void notificarObservador();
}
