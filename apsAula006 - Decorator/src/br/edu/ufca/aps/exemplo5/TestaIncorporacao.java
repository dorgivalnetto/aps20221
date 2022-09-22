package br.edu.ufca.aps.exemplo5;

public class TestaIncorporacao {

	public static void main(String[] args) {
		
		Cargo aux1 = new Auxiliar(3000, "Auxiliar");
		System.out.println(aux1.mostraNome() + " R$" + aux1.calculaSalario());
		Cargo adj1 = new Adjunto(5000, "Adjunto");
		System.out.println(adj1.mostraNome() + " R$" + adj1.calculaSalario());
		
		Incorporado coo1 = new Coordenador(0, "Coordenador");
		coo1.setIncorporacao(aux1);
		System.out.println(coo1.mostraNome() + " R$" + coo1.calculaSalario());
		
		Incorporado dir1 = new Diretor(0, "Diretor");
		dir1.setIncorporacao(adj1);
		System.out.println(dir1.mostraNome() + " R$" + dir1.calculaSalario());
		
		Incorporado rei1 = new Reitor(0, "Reitor");
		rei1.setIncorporacao(dir1);
		System.out.println(rei1.mostraNome() + " R$" + rei1.calculaSalario());
	}
}
