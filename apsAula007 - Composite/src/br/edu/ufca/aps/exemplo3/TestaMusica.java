package br.edu.ufca.aps.exemplo3;

public class TestaMusica {

	public static void main(String[] args) {
		// Crie uma nova playlist vazia chamada "Foco no Estudo!" 
		Playlist estudando = new Playlist("Foco no Estudo!");		

		// Crie uma nova playlist chamada "Coding Mode" e adicione 2 músicas
		Playlist programando = new Playlist("Coding Mode");
		Musica programandoMusica1 = new Musica("Candles", "Jon Hopkins");
		Musica programandoMusica2 = new Musica("Day one", "Hans Zimmer");
		programando.add(programandoMusica1);
		programando.add(programandoMusica2);
		
		//Reproduzindo a playlist
		programando.tocar();

		System.out.println (" === O nome da playlist é: " + programando.getNome() + " ===");
				
		

		/* Crie uma nova playlist chamada "Sol e Churrasco" e adicione 3 músicas 
		 então configure a valocidade de reprodução para 0.5x */
		Playlist descansando = new Playlist("Sol e Churrasco");		
		Musica descansandoMusica1 = new Musica("Parada Louca", "Mari Fernandes");
		Musica descansandoMusica2 = new Musica("Arranhão", "Henrique e Juliano");	
		Musica descansandoMusica3 = new Musica("Melhor eu ir", "Grupo menos é mais");
		descansando.add(descansandoMusica1);
		descansando.add(descansandoMusica2);
		descansando.add(descansandoMusica3);
		
		float velocidadeLenta = 0.5f;
		descansando.setVelocidadeReproducao(velocidadeLenta);

		//Reproduzindo a playlist
		descansando.tocar();

		System.out.println (" === O nome da playlist é: " + descansando.getNome() + " ===");
		
		/* Crie uma nova música, configure a velocidade de repodução em 1.25x
		 e toque a música. 
		 O nome da música para concentração é "Makeshift Dream" e o artista 
		 desta música é "Aron Edwards" */
		Musica concentracao = new Musica("Makeshift Dream", "Aron Edwards");
		float velocidadeRapida = 1.25f;
		concentracao.setVelocidadeReproducao(velocidadeRapida);
		concentracao.tocar(); 
		
		//Imprima as informações sobre a música para concentração
		String nome = concentracao.getNome(); 
		String artista = concentracao.getArtista();
		System.out.println ("O nome da música é: " + nome );
		System.out.println ("O artista da música é: " + artista );

		// Adicione a música para concentração na playlist "Foco no Estudo!" 
		estudando.add(concentracao);

		// Toque a playlist "Foco no Estudo!"
		estudando.tocar();

		// Exiba o nome da playlist que está sendo reproduzida → "Foco no Estudo!"
		System.out.println (" === O nome da playlist é: " + estudando.getNome() + " ===");
		
	}
}
