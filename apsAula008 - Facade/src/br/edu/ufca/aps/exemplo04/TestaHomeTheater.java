package br.edu.ufca.aps.exemplo04;

public class TestaHomeTheater {

	public static void main(String[] args) {
		//Criando as instâncias dos componentes
		Amplificador amp = new Amplificador("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
		Projetor projector = new Projetor("Top-O-Line Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Tela de Cinema");
		PopcornPopper popper = new PopcornPopper("Pipoca de Cinema");
 
		
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, dvd, cd, 
						projector, screen, lights, popper);
 
		homeTheater.watchMovie("The House of the Dragon");
		homeTheater.endMovie();
	}
}
