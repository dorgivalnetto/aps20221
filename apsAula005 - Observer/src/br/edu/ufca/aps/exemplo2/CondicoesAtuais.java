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
		System.out.println("** Condi��es atuais ** \n Temperatura: " + temperatura + "�C \n" +
		" Umidade" + umidade + "% \n Press�o atmosf�rica " + pressao + " hPa");
	}

	@Override
	public void exibirAtualizacao() {
		// TODO Auto-generated method stub
		
	}

	
}
