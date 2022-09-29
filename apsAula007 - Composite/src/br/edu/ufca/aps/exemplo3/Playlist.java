package br.edu.ufca.aps.exemplo3;

import java.util.ArrayList;

public class Playlist implements Componente {

	private String nomePlayList;
	private ArrayList<Componente> playlists;
	
	public Playlist(String nomePlaylist) {
		this.nomePlayList = nomePlaylist;
		this.playlists = new ArrayList<Componente>();
	}
	
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		for(Componente componente: this.playlists) {
			componente.tocar();
		}
	}

	@Override
	public void setVelocidadeReproducao(float velocidade) {
		// TODO Auto-generated method stub
		for(Componente componente: this.playlists) {
			componente.setVelocidadeReproducao(velocidade);
		}
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nomePlayList;
	}
	
	public void add(Componente componente) {
		playlists.add(componente);
		System.out.println("Adicionado com sucesso a playlist " + this.nomePlayList);
	}
	
	public void remove(Componente componente) {
		playlists.remove(componente);
	}
	

}
