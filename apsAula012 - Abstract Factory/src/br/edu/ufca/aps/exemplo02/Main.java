package br.edu.ufca.aps.exemplo02;

public class Main {
	
	public static CarroFabrica getFabrica(int fab){
		if(fab == 1){
			return new Jeep();
		}
		if(fab == 2){
			return new Honda();
		}
		return null;
	}
	
	public static Cor getCor(int cdCor){
		if(cdCor == 1){
			return new Preto();
		}
		if(cdCor == 2){
			return new Prata();
		}
		return null;
	}
	
	public static void main(String[] args) {
		CarroFabrica fabrica = Main.getFabrica(2);
		
		Sedan s1 = fabrica.criarSedan(1, "Honda City", 114300, new Preto());
		System.out.println(s1);	
		
		Luxo l1 = fabrica.criarLuxo(2, "Jeep Compass", 225390, Main.getCor(2));
		System.out.println(l1);
	}

}
