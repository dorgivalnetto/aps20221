package br.edu.ufca.aps.exemplo4;

public class FaWeb implements FaObserver{

	@Override
	public void update(Revista r) {
		// TODO Auto-generated method stub
		System.out.println("Atualizacao na pagina web");
		System.out.println( r.getState() );		
	}

}
