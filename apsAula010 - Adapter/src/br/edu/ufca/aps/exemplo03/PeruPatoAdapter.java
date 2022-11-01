package br.edu.ufca.aps.exemplo03;

public class PeruPatoAdapter extends Peru
				implements Pato{
	
	@Override
	public void grasnar() {
		canto();
	}

	@Override
	public void voar() {
		baterAsas();
	}
}