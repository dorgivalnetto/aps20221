package br.edu.ufca.aps.exemplo3;

public class Musica implements Componente{

	private String nomeMusica;
	private String artista;
	private float velocidadeReproducao = 1;
	
	public Musica(String nomeMusica, String artista) {
		this.nomeMusica = nomeMusica;
		this.artista = artista;
	}
	
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Reproduzindo a música... " + this.nomeMusica);
	}

	@Override
	public void setVelocidadeReproducao(float velocidade) {
		// TODO Auto-generated method stub
		this.velocidadeReproducao = velocidade;
		System.out.println("Configurando a velocidade de reprodução para " + velocidadeReproducao);
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nomeMusica;
	}
	
	public String getArtista() {
		return this.artista;
	}

}
