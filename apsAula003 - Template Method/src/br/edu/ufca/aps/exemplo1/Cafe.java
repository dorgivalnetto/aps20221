package br.edu.ufca.aps.exemplo1;

public class Cafe {

	public void prepararReceita() { 
		ferverAgua();
		prepararPoDeCafe();
		colocarNaXicara();
		adicionarAcucarELeite();
	}
	
	public void ferverAgua() {
		System.out.println("Fervendo água");
	}
	
	public void prepararPoDeCafe() {
		System.out.println("Colocando café no filtro");
	} 
		
	public void colocarNaXicara() {
		System.out.println("Colocando na xícara");
	} 
	
	public void adicionarAcucarELeite() {
		System.out.println("Adicionando açúcar e leite");
	}
}
