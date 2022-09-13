package br.edu.ufca.aps.exemplo4;

public class TestaEditora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FaWeb fa1 = new FaWeb();
		FaWeb fa2 = new FaWeb();
		
		RevistaCaras rev = new RevistaCaras();
		rev.attach(fa1);
		rev.attach(fa2);
		
		rev.setNoticia("Flávia é pega beijando um cavalo");
	}

}
