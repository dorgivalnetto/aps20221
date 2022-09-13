package br.edu.ufca.aps.exemplo4;

public class RevistaCaras extends Revista {
	
	private String noticia;

	public RevistaCaras() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getState() {
		return noticia;		
	} 
	
	public void setNoticia(String noticia){
		this.noticia = noticia;	
		notificar();
	}
}
