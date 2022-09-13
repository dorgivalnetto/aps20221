package br.edu.ufc.aps.exemplo1;

public class ObservadorHexa extends Observer {

	public ObservadorHexa(ConcreteSubject subject) {
		this.subject = subject;
		this.subject.adicionarObservador(this);
	}
	
	@Override
	public void atualizarObservador() {
		// TODO Auto-generated method stub
		System.out.println("String hexadecimal: " +
				Integer.toHexString( subject.getEstado()));
	}}
