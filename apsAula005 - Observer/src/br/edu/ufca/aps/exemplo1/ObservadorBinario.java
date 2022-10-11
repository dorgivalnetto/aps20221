package br.edu.ufca.aps.exemplo1;

public class ObservadorBinario extends Observer {

	public ObservadorBinario(ConcreteSubject subject) {
		this.subject = subject;
		this.subject.adicionarObservador(this);
	}
	
	@Override
	public void atualizarObservador() {
		// TODO Auto-generated method stub
		System.out.println("String binária: " +
				Integer.toBinaryString( subject.getEstado()));
	}

}
