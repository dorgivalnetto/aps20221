package br.edu.ufca.aps.exemplo1;

public class Cafe {

	public void prepararReceita() { 
		ferverAgua();
		prepararPoDeCafe();
		colocarNaXicara();
		adicionarAcucarELeite();
	}
	
	public void ferverAgua() {
		System.out.println("Fervendo �gua");
	}
	
	public void prepararPoDeCafe() {
		System.out.println("Colocando caf� no filtro");
	} 
		
	public void colocarNaXicara() {
		System.out.println("Colocando na x�cara");
	} 
	
	public void adicionarAcucarELeite() {
		System.out.println("Adicionando a��car e leite");
	}
}
