package br.edu.ufca.aps.exemplo2;

public class CondicoesAtuais implements Observer {

	private float temperatura;
	private float umidade;
	private DadosMeteorologicosSubject subject;
	
	public CondicoesAtuais(DadosMeteorologicosSubject subject) {
		this.subject = subject;
		subject.adicionarObservador(this);
	}
	
	@Override
	public void atualizar(float temperatura, float umidade, float pressao) {
		// TODO Auto-generated method stub
		this.temperatura = temperatura;
		this.umidade = umidade;
		System.out.println("** Condições atuais ** \n Temperatura: " + temperatura + "ºC \n" +
		" Umidade" + umidade + "% \n Pressão atmosférica " + pressao + " hPa");
	}

	@Override
	public void exibirAtualizacao() {
		// TODO Auto-generated method stub
		
	}

	
}
